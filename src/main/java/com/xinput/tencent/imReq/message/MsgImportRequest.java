package com.xinput.tencent.imReq.message;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-11 15:51
 * 导入单聊消息
 */
public class MsgImportRequest {

    /**
     * 消息是否已读
     * {@link com.xinput.tencent.enums.SyncFromOldSystemEnum}
     */
    @JsonProperty("SyncFromOldSystem")
    private Integer syncFromOldSystem;

    /**
     * 消息发送方 Identifier，用于指定发送消息方
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 消息接收方 Identifier
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 消息随机数，由随机函数产生，仅用于后台定位问题，后台不会根据该字段去重
     */
    @JsonProperty("MsgRandom")
    private int msgRandom;

    /**
     * 消息时间戳，UNIX 时间戳，单位为秒。后台不会根据该字段去重
     */
    @JsonProperty("MsgTimeStamp")
    private int msgTimeStamp;

    @JsonProperty("MsgBody")
    private List<com.xinput.tencent.imReq.message.MsgBody> MsgBody;

    public Integer getSyncFromOldSystem() {
        return syncFromOldSystem;
    }

    public void setSyncFromOldSystem(Integer syncFromOldSystem) {
        this.syncFromOldSystem = syncFromOldSystem;
    }

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

    public int getMsgRandom() {
        return msgRandom;
    }

    public void setMsgRandom(int msgRandom) {
        this.msgRandom = msgRandom;
    }

    public int getMsgTimeStamp() {
        return msgTimeStamp;
    }

    public void setMsgTimeStamp(int msgTimeStamp) {
        this.msgTimeStamp = msgTimeStamp;
    }

    public List<com.xinput.tencent.imReq.message.MsgBody> getMsgBody() {
        return MsgBody;
    }

    public void setMsgBody(List<com.xinput.tencent.imReq.message.MsgBody> msgBody) {
        MsgBody = msgBody;
    }
}
