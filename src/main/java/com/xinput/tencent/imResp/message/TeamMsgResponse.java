package com.xinput.tencent.imResp.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xinput.tencent.imResp.TencentApiResponse;

/**
 * @Author: xinput
 * @Date: 2020-02-13 10:51
 */
public class TeamMsgResponse extends TencentApiResponse {

    @JsonProperty("MsgTime")
    private Integer msgTime;

    @JsonProperty("MsgSeq")
    private String msgSeq;

    public Integer getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Integer msgTime) {
        this.msgTime = msgTime;
    }

    public String getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(String msgSeq) {
        this.msgSeq = msgSeq;
    }
}
