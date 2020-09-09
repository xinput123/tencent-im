package com.xinput.tencent.imReq.team;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-13 00:03
 * 增加群组成员
 */
public class TeamAddMemberRequest {

    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 当 Silence 为 1 时，成员添加成功后，不会给任何人下发系统通知
     */
    @JsonProperty("Silence")
    private Integer silence;

    @JsonProperty("MemberList")
    private List<Member> members;

    public static class Member {
        @JsonProperty("Member_Account")
        private String memberAccount;

        public String getMemberAccount() {
            return memberAccount;
        }

        public void setMemberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
        }
    }

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

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
