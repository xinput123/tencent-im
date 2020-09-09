package com.xinput.tencent.imResp.team;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xinput.tencent.imResp.TencentApiResponse;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-12 20:55
 * 群组详细信息
 */
public class TeamDetailResponse extends TencentApiResponse {

    @JsonProperty("GroupInfo")
    private List<TeamInfo> teamInfos;

    public List<TeamInfo> getTeamInfos() {
        return teamInfos;
    }

    public void setTeamInfos(List<TeamInfo> teamInfos) {
        this.teamInfos = teamInfos;
    }
}
