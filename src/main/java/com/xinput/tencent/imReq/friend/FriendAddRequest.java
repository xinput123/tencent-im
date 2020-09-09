package com.xinput.tencent.imReq.friend;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-11 19:48
 * 添加好友
 */
public class FriendAddRequest {

    /**
     * 需要为该 UserID 添加好友
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 加好友方式（默认双向加好友方式）
     * {@link com.xinput.tencent.enums.AddTypeEnum}
     */
    @JsonProperty("AddType")
    private String addType;

    /**
     * 管理员强制加好友标记：1表示强制加好友，0表示常规加好友方式
     */
    @JsonProperty("ForceAddFlags")
    private Integer ForceAddFlags;

    /**
     * 好友结构体对象
     */
    @JsonProperty("AddFriendItem")
    private List<FriendItem> addFriendItem;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getAddType() {
        return addType;
    }

    public void setAddType(String addType) {
        this.addType = addType;
    }

    public Integer getForceAddFlags() {
        return ForceAddFlags;
    }

    public void setForceAddFlags(Integer forceAddFlags) {
        ForceAddFlags = forceAddFlags;
    }

    public List<FriendItem> getAddFriendItem() {
        return addFriendItem;
    }

    public void setAddFriendItem(List<FriendItem> addFriendItem) {
        this.addFriendItem = addFriendItem;
    }

}
