package com.xinput.tencent.imReq.team;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * 修改群组基础资料
 */
public class TeamBaseInfoRequest {

    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 群名称（选填）
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 群简介（选填）
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 群公告（选填）
     */
    @JsonProperty("Notification")
    private String notification;

    /**
     * 群头像（选填）
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    /**
     * 最大群成员数量（选填）
     */
    @JsonProperty("MaxMemberNum")
    private Integer maxMemberNum;

    /**
     * 申请加群方式（选填）
     */
    @JsonProperty("ApplyJoinOption")
    private String applyJoinOption;

    /**
     * 设置全员禁言（选填）:"On"开启，"Off"关闭
     */
    @JsonProperty("ShutUpAllMember")
    private String shutUpAllMember;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
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
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public Integer getMaxMemberNum() {
        return maxMemberNum;
    }

    public void setMaxMemberNum(Integer maxMemberNum) {
        this.maxMemberNum = maxMemberNum;
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
}
