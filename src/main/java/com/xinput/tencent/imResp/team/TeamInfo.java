package com.xinput.tencent.imResp.team;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-12 21:35
 * 群组信息
 */
public class TeamInfo {

    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 针对该群组的返回结果
     */
    @JsonProperty("ErrorCode")
    private int errorCode;

    /**
     * 针对该群组的返回结果
     */
    @JsonProperty("ErrorInfo")
    private String errorInfo;

    /**
     * 群组类型
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 群组名称
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 群组简介
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 群组通知
     */
    @JsonProperty("Notification")
    private String Notification;

    /**
     * 群组头像
     */
    @JsonProperty("FaceUrl")
    private String FaceUrl;

    /**
     * 群主 ID
     */
    @JsonProperty("Owner_Account")
    private String Owner_Account;

    /**
     * 群组创建时间（UTC 时间）
     */
    @JsonProperty("CreateTime")
    private Integer CreateTime;

    /**
     * 最后群资料变更时间（UTC 时间）
     */
    @JsonProperty("LastInfoTime")
    private Integer LastInfoTime;

    /**
     * 群内最后一条消息的时间（UTC 时间）
     */
    @JsonProperty("LastMsgTime")
    private Integer LastMsgTime;

    @JsonProperty("NextMsgSeq")
    private Integer NextMsgSeq;

    /**
     * 当前群成员数量
     */
    @JsonProperty("MemberNum")
    private Integer MemberNum;

    /**
     * 最大群成员数量
     */
    @JsonProperty("MaxMemberNum")
    private Integer MaxMemberNum;

    /**
     * 申请加群处理方式
     */
    @JsonProperty("ApplyJoinOption")
    private String applyJoinOption;

    /**
     * 群全员禁言状态
     */
    @JsonProperty("ShutUpAllMember")
    private String shutUpAllMember;

    /**
     * 群组维度的自定义字段
     */
    @JsonProperty("AppDefinedData")
    private List<TeamDefined> teamDefineds;

    /**
     * 群成员列表
     */
    @JsonProperty("MemberList")
    private List<TeamMember> teamMembers;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getNotification() {
        return Notification;
    }

    public void setNotification(String notification) {
        Notification = notification;
    }

    public String getFaceUrl() {
        return FaceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        FaceUrl = faceUrl;
    }

    public String getOwner_Account() {
        return Owner_Account;
    }

    public void setOwner_Account(String owner_Account) {
        Owner_Account = owner_Account;
    }

    public Integer getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Integer createTime) {
        CreateTime = createTime;
    }

    public Integer getLastInfoTime() {
        return LastInfoTime;
    }

    public void setLastInfoTime(Integer lastInfoTime) {
        LastInfoTime = lastInfoTime;
    }

    public Integer getLastMsgTime() {
        return LastMsgTime;
    }

    public void setLastMsgTime(Integer lastMsgTime) {
        LastMsgTime = lastMsgTime;
    }

    public Integer getNextMsgSeq() {
        return NextMsgSeq;
    }

    public void setNextMsgSeq(Integer nextMsgSeq) {
        NextMsgSeq = nextMsgSeq;
    }

    public Integer getMemberNum() {
        return MemberNum;
    }

    public void setMemberNum(Integer memberNum) {
        MemberNum = memberNum;
    }

    public Integer getMaxMemberNum() {
        return MaxMemberNum;
    }

    public void setMaxMemberNum(Integer maxMemberNum) {
        MaxMemberNum = maxMemberNum;
    }

    public String getApplyJoinOption() {
        return applyJoinOption;
    }

    public void setApplyJoinOption(String applyJoinOption) {
        this.applyJoinOption = applyJoinOption;
    }

    public String getShutUpAllMember() {
        return shutUpAllMember;
    }

    public void setShutUpAllMember(String shutUpAllMember) {
        this.shutUpAllMember = shutUpAllMember;
    }

    public List<TeamDefined> getTeamDefineds() {
        return teamDefineds;
    }

    public void setTeamDefineds(List<TeamDefined> teamDefineds) {
        this.teamDefineds = teamDefineds;
    }

    public List<TeamMember> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<TeamMember> teamMembers) {
        this.teamMembers = teamMembers;
    }
}
