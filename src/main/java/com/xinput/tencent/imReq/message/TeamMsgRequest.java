package com.xinput.tencent.imReq.message;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-13 10:43
 */
public class TeamMsgRequest {

    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("Random")
    private Integer random;

    @JsonProperty("MsgBody")
    private List<MsgBody> msgBody;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Integer getRandom() {
        return random;
    }

    public void setRandom(Integer random) {
        this.random = random;
    }

    public List<MsgBody> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<MsgBody> msgBody) {
        this.msgBody = msgBody;
    }
}
