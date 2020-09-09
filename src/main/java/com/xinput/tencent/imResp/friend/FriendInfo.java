package com.xinput.tencent.imResp.friend;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-12 17:11
 */
public class FriendInfo {

    /**
     * 请求校验的用户的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 校验成功时 To_Account 与 From_Account 之间的好友关系
     */
    @JsonProperty("Relation")
    private String relation;

    /**
     * 0表示成功，非0表示失败
     */
    @JsonProperty("ResultCode")
    private int resultCode;

    /**
     * To_Account 的错误描述信息，成功时该字段为空
     */
    @JsonProperty("ResultInfo")
    private String resultInfo;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }
}
