package com.xinput.tencent.imResp.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xinput.tencent.imResp.TencentApiResponse;

import java.util.List;

/**
 * 群组消息撤回
 */
public class TeamMsgWithDrawResponse extends TencentApiResponse {

    @JsonProperty("RecallRetList")
    private List<RecallRet> recallRets;

    public List<RecallRet> getRecallRets() {
        return recallRets;
    }

    public void setRecallRets(List<RecallRet> recallRets) {
        this.recallRets = recallRets;
    }

    public static class RecallRet {

        @JsonProperty("MsgSeq")
        private int msgSeq;

        @JsonProperty("RetCode")
        private int retCode;

        public int getMsgSeq() {
            return msgSeq;
        }

        public void setMsgSeq(int msgSeq) {
            this.msgSeq = msgSeq;
        }

        public int getRetCode() {
            return retCode;
        }

        public void setRetCode(int retCode) {
            this.retCode = retCode;
        }
    }
}
