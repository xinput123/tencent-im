package com.xinput.tencent.imReq.account;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-08 19:48
 * @Versioin: 1.0.0
 */
public class AccountItem {

    @JsonProperty("UserID")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
