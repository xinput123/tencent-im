package com.xinput.tencent.imReq.friend;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-11 19:54
 * 好友结构体对象
 */
public class FriendItem {

    /**
     * 好友的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 加好友来源字段
     */
    @JsonProperty("AddSource")
    private String addSource;

    /**
     * From_Account 对 To_Account 的好友备注
     */
    @JsonProperty("Remark")
    private String remark;

    /**
     * From_Account 对 To_Account 的分组信息
     */
    @JsonProperty("GroupName")
    private String groupName;

    /**
     * From_Account 和 To_Account 形成好友关系时的附言信息
     */
    @JsonProperty("AddWording")
    private String addWording;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getAddSource() {
        return addSource;
    }

    public void setAddSource(String addSource) {
        this.addSource = addSource;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getAddWording() {
        return addWording;
    }

    public void setAddWording(String addWording) {
        this.addWording = addWording;
    }

}
