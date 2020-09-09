package com.xinput.tencent.imResp.team;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xinput.tencent.imResp.TencentApiResponse;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-13 09:45
 */
public class TeamAddMemberResponse extends TencentApiResponse {

    @JsonProperty("MemberList")
    private List<Member> members;

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public static class Member {

        @JsonProperty("Member_Account")
        private String memberAccount;

        @JsonProperty("Result")
        private int result;

        public String getMemberAccount() {
            return memberAccount;
        }

        public void setMemberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
        }

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }
    }
}
