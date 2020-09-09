package com.xinput.tencent.imReq.friend;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-12 17:30
 */
public class FriendListRequest {

    /**
     * 指定要拉取好友数据的用户的 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 分页的起始位置
     */
    @JsonProperty("StartIndex")
    private Integer startIndex;

    /**
     * 上次拉好友数据时返回的 StandardSequence，如果 StandardSequence 字段的值
     * 与后台一致，后台不会返回标配好友数据
     */
    @JsonProperty("StandardSequence")
    private Integer standardSequence;

    /**
     * 上次拉好友数据时返回的 CustomSequence，如果 CustomSequence 字段的值与
     * 后台一致，后台不会返回自定义好友数据
     */
    @JsonProperty("CustomSequence")
    private Integer customSequence;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getStandardSequence() {
        return standardSequence;
    }

    public void setStandardSequence(Integer standardSequence) {
        this.standardSequence = standardSequence;
    }

    public Integer getCustomSequence() {
        return customSequence;
    }

    public void setCustomSequence(Integer customSequence) {
        this.customSequence = customSequence;
    }
}
