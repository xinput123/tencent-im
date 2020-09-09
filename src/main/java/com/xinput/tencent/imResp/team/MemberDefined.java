package com.xinput.tencent.imResp.team;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-12 21:37
 * 群成员自定义字段
 */
public class MemberDefined {

    /**
     * 自定义字段的key
     */
    @JsonProperty("Key")
    private String key;

    /**
     * 自定义字段的值
     */
    @JsonProperty("Value")
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
