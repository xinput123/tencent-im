package com.xinput.tencent.imResp.friend;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xinput.tencent.imResp.TencentApiResponse;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-12 17:30
 */
public class FriendListResponse extends TencentApiResponse {

    /**
     * 标配好友数据的 Sequence，客户端可以保存该 Sequence，
     * 下次请求时通过请求的 StandardSequence 字段返回给后台
     */
    @JsonProperty("StandardSequence")
    private Integer standardSequence;

    /**
     * 自定义好友数据的 Sequence，客户端可以保存该 Sequence，
     * 下次请求时通过请求的 CustomSequence 字段返回给后台
     */
    @JsonProperty("CustomSequence")
    private Integer customSequence;

    /**
     * 好友总数
     */
    @JsonProperty("FriendNum")
    private Integer friendNum;

    /**
     * 分页的结束标识，非0值表示已完成全量拉取
     */
    @JsonProperty("CompleteFlag")
    private Integer completeFlag;

    /**
     * 分页接口下一页的起始位置
     */
    @JsonProperty("NextStartIndex")
    private Integer nextStartIndex;

    /**
     * 详细的客户端展示信息
     */
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    /**
     * 好友对象数组，每一个好友对象都包含一个 To_Account 字段和一个 ValueItem 数组
     */
    @JsonProperty("userDataItem")
    private List<UserDataItem> userDataItems;

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

    public Integer getFriendNum() {
        return friendNum;
    }

    public void setFriendNum(Integer friendNum) {
        this.friendNum = friendNum;
    }

    public Integer getCompleteFlag() {
        return completeFlag;
    }

    public void setCompleteFlag(Integer completeFlag) {
        this.completeFlag = completeFlag;
    }

    public Integer getNextStartIndex() {
        return nextStartIndex;
    }

    public void setNextStartIndex(Integer nextStartIndex) {
        this.nextStartIndex = nextStartIndex;
    }

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    public List<UserDataItem> getUserDataItems() {
        return userDataItems;
    }

    public void setUserDataItems(List<UserDataItem> userDataItems) {
        this.userDataItems = userDataItems;
    }
}
