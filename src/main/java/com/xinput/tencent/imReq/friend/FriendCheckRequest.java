package com.xinput.tencent.imReq.friend;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-12 15:57
 * 校验好友
 */
public class FriendCheckRequest {

    /**
     * 需要校验该 UserID 的好友
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 请求校验的好友的 UserID 列表，单次请求的 To_Account 数不得超过1000
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    /**
     * 校验模式
     * {@link com.xinput.tencent.enums.FriendCheckTypeEnum}
     */
    @JsonProperty("CheckType")
    private String CheckType;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }

    public String getCheckType() {
        return CheckType;
    }

    public void setCheckType(String checkType) {
        CheckType = checkType;
    }

}
