package com.xinput.tencent.imReq.team;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-12 21:25
 */
public class TeamDetailRequest {

    @JsonProperty("GroupIdList")
    private List<String> groupIds;

    public List<String> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
    }
}
