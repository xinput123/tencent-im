package com.xinput.tencent.imResp.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xinput.tencent.imResp.TencentApiResponse;

import java.util.List;

/**
 * 批量发送消息应答
 */
public class MsgBatchResponse extends TencentApiResponse {

    /**
     * 消息唯一标识，用于撤回
     */
    @JsonProperty("MsgKey")
    private String msgKey;

    /**
     * 发送消息失败列表
     */
    @JsonProperty("ErrorList")
    private List<MsgError> errorBeans;

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }

    public List<MsgError> getErrorBeans() {
        return errorBeans;
    }

    public void setErrorBeans(List<MsgError> errorBeans) {
        this.errorBeans = errorBeans;
    }
}
