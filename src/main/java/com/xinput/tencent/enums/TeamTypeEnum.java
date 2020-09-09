package com.xinput.tencent.enums;

/**
 * @Author: xinput
 * 群组类型：Private/Public/ChatRoom/AVChatRoom/BChatRoom
 */
public enum TeamTypeEnum {
    PRIVATE("Private", "私有群"),
    PUBLIC("Public", "公开群"),
    CHATROOM("ChatRoom", "聊天室"),
    AVCHATROOM("AVChatRoom", "音视频聊天室"),
    BCHATROOM("BChatRoom", "在线成员广播大群");

    private String teamType;

    private String teamTypeDesc;

    TeamTypeEnum(String teamType, String teamTypeDesc) {
        this.teamType = teamType;
        this.teamTypeDesc = teamTypeDesc;
    }

    public String getTeamType() {
        return teamType;
    }

    public String getTeamTypeDesc() {
        return teamTypeDesc;
    }
}
