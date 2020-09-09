package com.xinput.tencent.imResp.team;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-12 21:40
 * 群成员列表
 */
public class TeamMember {

    /**
     * 成员 ID
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 群内角色
     */
    @JsonProperty("Role")
    private String role;

    /**
     * 入群时间（UTC 时间）
     */
    @JsonProperty("JoinTime")
    private Integer joinTime;

    /**
     *
     */
    @JsonProperty("MsgSeq")
    private Integer msgSeq;

    /**
     * 消息屏蔽选项
     */
    @JsonProperty("MsgFlag")
    private String msgFlag;

    /**
     * 最后发言时间（UTC 时间
     */
    @JsonProperty("LastSendMsgTime")
    private Integer lastSendMsgTime;

    /**
     * 禁言截至时间（UTC 时间）
     */
    @JsonProperty("ShutUpUntil")
    private Integer shutUpUntil;

    /**
     * 群成员自定义字段
     */
    @JsonProperty("AppMemberDefinedData")
    private List<MemberDefined> memberDefineds;

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Integer joinTime) {
        this.joinTime = joinTime;
    }

    public Integer getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Integer msgSeq) {
        this.msgSeq = msgSeq;
    }

    public String getMsgFlag() {
        return msgFlag;
    }

    public void setMsgFlag(String msgFlag) {
        this.msgFlag = msgFlag;
    }

    public Integer getLastSendMsgTime() {
        return lastSendMsgTime;
    }

    public void setLastSendMsgTime(Integer lastSendMsgTime) {
        this.lastSendMsgTime = lastSendMsgTime;
    }

    public Integer getShutUpUntil() {
        return shutUpUntil;
    }

    public void setShutUpUntil(Integer shutUpUntil) {
        this.shutUpUntil = shutUpUntil;
    }

    public List<MemberDefined> getMemberDefineds() {
        return memberDefineds;
    }

    public void setMemberDefineds(List<MemberDefined> memberDefineds) {
        this.memberDefineds = memberDefineds;
    }
}
