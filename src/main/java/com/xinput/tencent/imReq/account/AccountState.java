package com.xinput.tencent.imReq.account;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-11 17:55
 */
public class AccountState {

    /**
     * 返回的用户的 Identifier
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 返回的用户状态
     */
    @JsonProperty("State")
    private String state;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
