package com.xinput.tencent.imResp.team;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xinput.tencent.imResp.TencentApiResponse;

/**
 * @Author: xinput
 * @Date: 2020-02-12 20:55
 * 创建群组响应
 */
public class TeamCreateResponse extends TencentApiResponse {

    /**
     * 群组Id
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
