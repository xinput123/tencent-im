package com.xinput.tencent.imReq.message;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-10 14:41
 * @Versioin: 1.0.0
 * <p>
 * 消息发送
 */
public class MsgRequest {

    /**
     * 1：把消息同步到 From_Account 在线终端和漫游上；
     * 2：消息不同步至 From_Account；
     * 若不填写默认情况下会将消息存 From_Account 漫游
     */
    @JsonProperty("SyncOtherMachine")
    private Integer syncOtherMachine;

    /**
     * 消息发送方 Identifier（用于指定发送消息方帐号）
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 消息接收方 Identifier
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 消息离线保存时长（单位：秒），最长为7天（604800秒）
     * 1、若设置该字段为0，则消息只发在线用户，不保存离线
     * 2、若设置该字段超过7天（604800秒），仍只保存7天
     * 3、若不设置该字段，则默认保存7天
     */
    @JsonProperty(value = "MsgLifeTime")
    private Integer msgLifeTime;

    /**
     * 消息随机数，由随机函数产生，用于后台定位问题
     */
    @JsonProperty("MsgRandom")
    private Integer msgRandom;

    /**
     * 消息时间戳，UNIX 时间戳（单位：秒）
     */
    @JsonProperty("MsgTimeStamp")
    private Integer msgTimeStamp;

    @JsonProperty("MsgBody")
    private List<MsgBody> msgBody;

    /**
     * 离线消息设置
     */
    @JsonProperty("OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;

    public Integer getSyncOtherMachine() {
        return syncOtherMachine;
    }

    public void setSyncOtherMachine(Integer syncOtherMachine) {
        this.syncOtherMachine = syncOtherMachine;
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

    public Integer getMsgLifeTime() {
        return msgLifeTime;
    }

    public void setMsgLifeTime(Integer msgLifeTime) {
        this.msgLifeTime = msgLifeTime;
    }

    public Integer getMsgRandom() {
        return msgRandom;
    }

    public void setMsgRandom(Integer msgRandom) {
        this.msgRandom = msgRandom;
    }

    public Integer getMsgTimeStamp() {
        return msgTimeStamp;
    }

    public void setMsgTimeStamp(Integer msgTimeStamp) {
        this.msgTimeStamp = msgTimeStamp;
    }

    public List<MsgBody> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<MsgBody> msgBody) {
        this.msgBody = msgBody;
    }

    public OfflinePushInfo getOfflinePushInfo() {
        return offlinePushInfo;
    }

    public void setOfflinePushInfo(OfflinePushInfo offlinePushInfo) {
        this.offlinePushInfo = offlinePushInfo;
    }
}
