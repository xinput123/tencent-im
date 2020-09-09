package com.xinput.tencent.imResp.friend;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-12 17:55
 */
public class ValueItem {

    /**
     * 好友字段的名称
     */
    @JsonProperty("Tag")
    private String tag;

    /**
     * 好友字段的值
     */
    @JsonProperty("Value")
    private String value;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
