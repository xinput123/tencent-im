package com.xinput.tencent.imReq.message;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-11 16:14
 * 消息撤回参数
 */
public class MsgWithDrawRequest {

    /**
     * 消息发送发
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 消息接收方
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 待撤回的消息的唯一ID
     */
    @JsonProperty("MsgKey")
    private String msgKey;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }

}
