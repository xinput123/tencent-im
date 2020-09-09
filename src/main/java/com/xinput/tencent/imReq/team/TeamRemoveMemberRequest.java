package com.xinput.tencent.imReq.team;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-13 00:03
 * 删除群组成员
 */
public class TeamRemoveMemberRequest {

    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 当 Silence 为 1 时，成员添加成功后，不会给任何人下发系统通知
     */
    @JsonProperty("Silence")
    private Integer silence;


    @JsonProperty("MemberToDel_Account")
    private List<String> members;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getSilence() {
        return silence;
    }

    public void setSilence(Integer silence) {
        this.silence = silence;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}
