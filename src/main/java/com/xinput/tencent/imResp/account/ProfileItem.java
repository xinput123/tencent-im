package com.xinput.tencent.imResp.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-11 17:40
 * <p>
 * 用户的资料对象数组，数组中每一个对象都包含了 Tag 和 Value
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfileItem {

    /**
     * 账户资料字段的名称：标配资料字段、自定义资料字段
     * {@link com.xinput.tencent.enums.TagPortraitEnum}
     */
    @JsonProperty("Tag")
    private String tag;

    /**
     * 资料字段的值
     */
    @JsonProperty("Value")
    private Object value;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
