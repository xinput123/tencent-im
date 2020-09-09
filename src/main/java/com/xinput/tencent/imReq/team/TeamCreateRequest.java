package com.xinput.tencent.imReq.team;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-12 20:49
 * 创建群组
 */
public class TeamCreateRequest {

    /**
     * 群主的 UserId
     */
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    /**
     * 群组类型：Private/Public/ChatRoom/AVChatRoom/BChatRoom
     * {@link com.xinput.tencent.enums.TeamTypeEnum}
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 群组名称
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 群组Id
     */
    @JsonProperty("GroupId")
    private String groupId;

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
