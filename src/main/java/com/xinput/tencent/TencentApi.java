package com.xinput.tencent;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import com.tencentyun.TLSSigAPIv2;
import com.xinput.bleach.util.JsonUtils;
import com.xinput.bleach.util.Logs;
import com.xinput.bleach.util.StringUtils;
import com.xinput.tencent.exception.TencentException;
import com.xinput.tencent.imResp.TencentApiResponse;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;

/**
 * @Author: xinput
 * @Date: 2020-02-04 10:48
 * @Versioin: 1.0.0
 */
public class TencentApi {

    private static Logger logger = Logs.get();

    /**
     * sdkAppid
     */
    private static String sdkAppid;

    /**
     * 私有key
     */
    private static String privateKey;

    /**
     * 默认IM账号
     */
    private static String identifier;

    private static volatile TLSSigAPIv2 singleton;

    private static TLSSigAPIv2 getSigApi() {
        if (null == singleton) {
            synchronized (TLSSigAPIv2.class) {
                if (null == singleton) {
                    singleton = new TLSSigAPIv2(Long.parseLong(sdkAppid), privateKey);
                }
            }
        }

        return singleton;
    }

    public static String getSig() {
        return getSig(identifier);
    }

    public static String getSig(String userId) {
        return getSigApi().genSig(userId, 180 * 86400);
    }

    public static void init(String appid, String key, String defaultAccount) {
        sdkAppid = appid;
        privateKey = key;
        identifier = defaultAccount;
    }

    public static String getSdkAppid() {
        return sdkAppid;
    }

    public static String getPrivateKey() {
        return privateKey;
    }

    public static String getIdentifier() {
        return identifier;
    }

    /**
     * 封装请求参数
     */
    private static Joiner.MapJoiner joiner = Joiner.on("&").withKeyValueSeparator("=");

    /**
     * 返回默认的参数
     */
    private static Map<String, String> getDefaultParams() {
        Map<String, String> pathParams = Maps.newHashMap();
        pathParams.put("usersig", TencentApi.getSig());
        pathParams.put("identifier", TencentApi.getIdentifier());
        pathParams.put("sdkappid", TencentApi.getSdkAppid());
        pathParams.put("random", UUID.randomUUID().toString().replaceAll("-", StringUtils.EMPTY).toLowerCase());
        pathParams.put("contenttype", "json");
        return pathParams;
    }

    public static <T extends TencentApiResponse> T baseRequest(String url, Object params, Class<T> cls) {
        String queryString = joiner.join(getDefaultParams());
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(url + queryString);
        // 设置请求的header
        post.addHeader("Content-type", "application/json;charset=utf-8");
        post.setHeader("Accept", "application/json");
        post.setEntity(new StringEntity(JsonUtils.toJsonString(params), StandardCharsets.UTF_8));

        T apiResponse = null;
        try {
            HttpResponse response = httpClient.execute(post);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity entity = response.getEntity();
                String resutlStr = EntityUtils.toString(entity, "UTF-8");
                logger.info("resutlStr = " + resutlStr);
                apiResponse = JsonUtils.toBean(resutlStr, cls);
                logger.info("request url {}, the params is: {}", url, JsonUtils.toJsonString(params, true));
                logger.info("request result is {}", resutlStr);
            }
        } catch (IOException e) {
            throw new TencentException("network error. url: " + url, e);
        }

        return apiResponse;
    }

}
