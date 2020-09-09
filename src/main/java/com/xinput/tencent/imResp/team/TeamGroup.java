package com.xinput.tencent.imResp.team;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-12 19:09
 */
public class TeamGroup {

    /**
     * 获取到的群组 ID 的集合
     */
    @JsonProperty("GroupId")
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
