package com.xinput.tencent.imReq.message;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-11 16:14
 * 撤回群组消息
 */
public class TeamMsgWithDrawRequest {

    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("MsgSeqList")
    private List<MsgSeq> msgSeqs;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<MsgSeq> getMsgSeqs() {
        return msgSeqs;
    }

    public void setMsgSeqs(List<MsgSeq> msgSeqs) {
        this.msgSeqs = msgSeqs;
    }

    public static class MsgSeq {
        @JsonProperty("MsgSeq")
        private Integer msgSeq;

        public Integer getMsgSeq() {
            return msgSeq;
        }

        public void setMsgSeq(Integer msgSeq) {
            this.msgSeq = msgSeq;
        }
    }
}
