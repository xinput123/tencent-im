package com.xinput.tencent.imResp.team;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xinput.tencent.imResp.TencentApiResponse;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-12 19:06
 */
public class TeamListResponse extends TencentApiResponse {

    /**
     * App 当前的群组总数
     */
    @JsonProperty("TotalCount")
    private Integer totalCount;

    /**
     * 分页拉取的标志
     */
    @JsonProperty("Next")
    private Long next;

    /**
     * 获取到的群组 ID 的集合
     */
    @JsonProperty("groupIdList")
    private List<TeamGroup> teamGroups;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Long getNext() {
        return next;
    }

    public void setNext(Long next) {
        this.next = next;
    }

    public List<TeamGroup> getTeamGroups() {
        return teamGroups;
    }

    public void setTeamGroups(List<TeamGroup> teamGroups) {
        this.teamGroups = teamGroups;
    }
}



