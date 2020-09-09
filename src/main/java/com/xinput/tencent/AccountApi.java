package com.xinput.tencent;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.xinput.tencent.enums.TagPortraitEnum;
import com.xinput.tencent.imReq.account.AccountCheckRequest;
import com.xinput.tencent.imReq.account.AccountDeleteRequest;
import com.xinput.tencent.imReq.account.AccountImportRequest;
import com.xinput.tencent.imReq.account.AccountQueryRequest;
import com.xinput.tencent.imReq.account.AccountUpdateRequest;
import com.xinput.tencent.imResp.account.AccountBatchResponse;
import com.xinput.tencent.imResp.account.AccountCheckResponse;
import com.xinput.tencent.imResp.account.AccountDeleteResponse;
import com.xinput.tencent.imResp.account.AccountKickResponse;
import com.xinput.tencent.imResp.account.AccountQueryResponse;
import com.xinput.tencent.imResp.account.AccountQueryStateResponse;
import com.xinput.tencent.imResp.account.AccountResponse;
import com.xinput.tencent.imResp.account.AccountUpdateResponse;
import com.xinput.tencent.imResp.account.ProfileItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: xinput
 * @Date: 2020-02-08 20:38
 * @Versioin: 1.0.0
 */
public class AccountApi {

    /**
     * 导入账号
     */
    public static AccountResponse accountImport(String accountId) {
        return accountImport(new AccountImportRequest(accountId));
    }

    /**
     * 导入账号
     */
    public static AccountResponse accountImport(String accountId, String nickName) {
        AccountImportRequest request = new AccountImportRequest();
        request.setIdentifier(accountId);
        request.setNick(nickName);

        return accountImport(request);
    }

    /**
     * 导入账号
     */
    public static AccountResponse accountImport(String accountId, String nickName, String faceUrl) {
        AccountImportRequest request = new AccountImportRequest();
        request.setIdentifier(accountId);
        request.setNick(nickName);
        request.setFaceUrl(faceUrl);

        return accountImport(request);
    }

    /**
     * 导入账号
     */
    public static AccountResponse accountImport(AccountImportRequest importAccount) {
        String url = "https://console.tim.qq.com/v4/im_open_login_svc/account_import?";
        return TencentApi.baseRequest(url, importAccount, AccountResponse.class);
    }

    /**
     * 批量导入账号
     */
    public static AccountBatchResponse accountBatchImport(List<String> accounts) {
        String url = "https://console.tim.qq.com/v4/im_open_login_svc/multiaccount_import?";
        return TencentApi.baseRequest(url, accounts, AccountBatchResponse.class);
    }

    /**
     * 批量导入账号
     */
    public static AccountBatchResponse accountBatchImport(String... accounts) {
        return accountBatchImport(Lists.newArrayList(accounts));
    }

    /**
     * 删除账号
     */
    public static AccountDeleteResponse delete(AccountDeleteRequest accountDeleteRequest) {
        String url = "https://console.tim.qq.com/v4/im_open_login_svc/account_delete?";
        return TencentApi.baseRequest(url, accountDeleteRequest, AccountDeleteResponse.class);
    }

    /**
     * 检查账号接口
     */
    public static AccountCheckResponse check(AccountCheckRequest accountCheck) {
        String url = "https://console.tim.qq.com/v4/im_open_login_svc/account_check?";
        return TencentApi.baseRequest(url, accountCheck, AccountCheckResponse.class);
    }

    /**
     * 账号登录态失效接口
     */
    public static AccountKickResponse kick(String accountId) {
        String url = "https://console.tim.qq.com/v4/im_open_login_svc/kick?";
        Map<String, Object> params = ImmutableMap.of("Identifier", accountId);
        return TencentApi.baseRequest(url, params, AccountKickResponse.class);
    }

    /**
     * 获取用户在线状态
     */
    public static AccountQueryStateResponse state(String... accountIds) {
        return state(Lists.newArrayList(accountIds));
    }

    /**
     * 获取用户在线状态
     */
    public static AccountQueryStateResponse state(List<String> accountIds) {
        String url = "https://console.tim.qq.com/v4/openim/querystate?";
        Map<String, Object> params = ImmutableMap.of("To_Account", accountIds);
        return TencentApi.baseRequest(url, params, AccountQueryStateResponse.class);
    }

    /**
     * 获取用户资料
     */
    public static AccountQueryResponse query(String accid) {
        List<String> accountIds = Lists.newArrayList(
                accid
        );

        List<String> tags = Lists.newArrayList(
                TagPortraitEnum.NICK.getTag(),
                TagPortraitEnum.GENDER.getTag(),
                TagPortraitEnum.IMAGE.getTag(),
                TagPortraitEnum.BIRTHDAY.getTag(),
                TagPortraitEnum.ROLE.getTag()
        );

        AccountQueryRequest request = new AccountQueryRequest();
        request.setToAccount(accountIds);
        request.setTagList(tags);

        return query(request);
    }

    /**
     * 获取用户资料
     */
    public static AccountQueryResponse query(AccountQueryRequest query) {
        String url = "https://console.tim.qq.com/v4/profile/portrait_get?";
        return TencentApi.baseRequest(url, query, AccountQueryResponse.class);
    }

    /**
     * 修改用户名
     */
    public static AccountUpdateResponse updateAccountName(String accountId, String name) {
        ProfileItem nameItem = new ProfileItem();
        nameItem.setTag(TagPortraitEnum.NICK.getTag());
        nameItem.setValue(name);

        List<ProfileItem> items = new ArrayList();
        items.add(nameItem);

        AccountUpdateRequest request = new AccountUpdateRequest();
        request.setFromAccount(accountId);
        request.setProfileItems(items);

        return update(request);
    }

    /**
     * 修改用户头像
     */
    public static AccountUpdateResponse updateAccountAvator(String accountId, String avator) {
        ProfileItem avatorItem = new ProfileItem();
        avatorItem.setValue(avator);
        avatorItem.setTag(TagPortraitEnum.IMAGE.getTag());

        List<ProfileItem> items = new ArrayList();
        items.add(avatorItem);

        AccountUpdateRequest request = new AccountUpdateRequest();
        request.setFromAccount(accountId);
        request.setProfileItems(items);

        return update(request);
    }

    /**
     * 修改用户名和头像
     */
    public static AccountUpdateResponse updateAccountNameAndFaceUrl(String accountId, String name, String avator) {
        ProfileItem nameItem = new ProfileItem();
        nameItem.setTag(TagPortraitEnum.NICK.getTag());
        nameItem.setValue(name);

        ProfileItem avatorItem = new ProfileItem();
        avatorItem.setTag(TagPortraitEnum.IMAGE.getTag());
        avatorItem.setValue(avator);

        List<ProfileItem> items = new ArrayList();
        items.add(nameItem);
        items.add(avatorItem);

        AccountUpdateRequest request = new AccountUpdateRequest();
        request.setFromAccount(accountId);
        request.setProfileItems(items);

        return update(request);
    }

    /**
     * 修改用户权限
     */
    public static AccountUpdateResponse updateAccountRole(String accountId, int role) {
        ProfileItem nameItem = new ProfileItem();
        nameItem.setTag(TagPortraitEnum.ROLE.getTag());
        nameItem.setValue(role);

        List<ProfileItem> items = new ArrayList();
        items.add(nameItem);

        AccountUpdateRequest request = new AccountUpdateRequest();
        request.setFromAccount(accountId);
        request.setProfileItems(items);

        return update(request);
    }

    /**
     * 修改用户资料
     */
    public static AccountUpdateResponse update(AccountUpdateRequest update) {
        String url = "https://console.tim.qq.com/v4/profile/portrait_set?";
        return TencentApi.baseRequest(url, update, AccountUpdateResponse.class);
    }
}
