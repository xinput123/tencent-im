package com.xinput.tencent.imResp.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultItem {

    @JsonProperty("UserID")
    private String userId;

    /**
     * 单个帐号的检查结果：0表示成功，非0表示失败
     */
    @JsonProperty("ResultCode")
    private String resultCode;

    /**
     * 单个帐号检查失败时的错误描述信息
     */
    @JsonProperty("ResultInfo")
    private String resultInfo;

    /**
     * 单个帐号的导入状态：Imported 表示已导入，NotImported 表示未导入
     */
    @JsonProperty("AccountStatus")
    private String accountStatus;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
}
