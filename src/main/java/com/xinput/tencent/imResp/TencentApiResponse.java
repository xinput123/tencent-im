package com.xinput.tencent.imResp;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author xinput
 */
public class TencentApiResponse {

    /**
     * 请求处理的结果，OK 表示处理成功，FAIL 表示失败
     */
    @JsonProperty("ActionStatus")
    private String actionStatus;

    /**
     * 错误信息
     */
    @JsonProperty("ErrorInfo")
    private String errorInfo;

    /**
     * 错误码
     */
    @JsonProperty("ErrorCode")
    private Integer errorCode;

    public String getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public boolean isSuccess() {
        return "OK".equalsIgnoreCase(actionStatus) && errorCode == 0;
    }

    @Override
    public String toString() {
        return "TencentApiResponse{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
