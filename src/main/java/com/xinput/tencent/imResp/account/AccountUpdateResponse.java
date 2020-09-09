package com.xinput.tencent.imResp.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xinput.tencent.imResp.TencentApiResponse;

/**
 * @Author: xinput
 * @Date: 2020-02-11 17:44
 * 设置账户资料响应值
 */
public class AccountUpdateResponse extends TencentApiResponse {

    /**
     * 详细的客户端展示信息
     */
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }
}
