package com.xinput.tencent.imReq.team;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-12 19:02
 * 获取全部群组
 */
public class TeamListRequest {

    /**
     * 本次获取的群组 ID 数量的上限，不得超过 10000。如果不填，默认为最大值 10000
     */
    @JsonProperty("Limit")
    private Integer limit;

    /**
     * 群太多时分页拉取标志，第一次填0，以后填上一次返回的值，返回的 Next 为0代表拉完了
     */
    @JsonProperty("Next")
    private Integer next;

    /**
     * 拉取哪种群组形态，不填为拉取所有
     */
    @JsonProperty("GroupType")
    private String groupType;

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }
}
