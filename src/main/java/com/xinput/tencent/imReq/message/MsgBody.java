package com.xinput.tencent.imReq.message;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-11 10:40
 * @Versioin: 1.0.0
 * <p>
 * 消息详情类型
 */
public class MsgBody {
    /**
     * TIM 消息对象类型
     * {@link com.xinput.tencent.enums.MsgTypeEnum}
     */
    @JsonProperty("MsgType")
    private String msgType;

    /**
     * 对于每种 MsgType 用不同的 MsgContent 格式
     */
    @JsonProperty("MsgContent")
    private MsgContent msgContent;

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public MsgContent getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(MsgContent msgContent) {
        this.msgContent = msgContent;
    }

}
