package com.xinput.tencent.imReq.message;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-11 10:40
 * @Versioin: 1.0.0
 * <p>
 * 消息具体内容:这里只发普通文本消息
 */
public class MsgContent {

    /**
     * 文本消息
     */
    @JsonProperty("Text")
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
