package com.xinput.tencent.imResp.friend;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-11 20:21
 */
public class FriendAddResultItem {

    /**
     * 请求添加的好友的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * To_Account 的处理结果，0表示成功，非0表示失败
     */
    @JsonProperty("resultCode")
    private Integer ResultCode;

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

    public Integer getResultCode() {
        return ResultCode;
    }

    public void setResultCode(Integer resultCode) {
        ResultCode = resultCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }
}
