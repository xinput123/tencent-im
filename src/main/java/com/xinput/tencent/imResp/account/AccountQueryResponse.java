package com.xinput.tencent.imResp.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xinput.tencent.imResp.TencentApiResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountQueryResponse extends TencentApiResponse {

    @JsonProperty("CurrentStandardSequence")
    private Integer currentStandardSequence;

    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    @JsonProperty("UserProfileItem")
    private List<UserProfileItem> userProfileItem;

    public Integer getCurrentStandardSequence() {
        return currentStandardSequence;
    }

    public void setCurrentStandardSequence(Integer currentStandardSequence) {
        this.currentStandardSequence = currentStandardSequence;
    }

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    public List<UserProfileItem> getUserProfileItem() {
        return userProfileItem;
    }

    public void setUserProfileItem(List<UserProfileItem> userProfileItem) {
        this.userProfileItem = userProfileItem;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UserProfileItem {
        @JsonProperty("To_Account")
        private String toAccount;

        @JsonProperty("ResultCode")
        private int resultCode;

        @JsonProperty("ResultInfo")
        private String resultInfo;

        @JsonProperty("ProfileItem")
        private List<ProfileItem> profileItem;

        public String getToAccount() {
            return toAccount;
        }

        public void setToAccount(String toAccount) {
            this.toAccount = toAccount;
        }

        public int getResultCode() {
            return resultCode;
        }

        public void setResultCode(int resultCode) {
            this.resultCode = resultCode;
        }

        public String getResultInfo() {
            return resultInfo;
        }

        public void setResultInfo(String resultInfo) {
            this.resultInfo = resultInfo;
        }

        public List<ProfileItem> getProfileItem() {
            return profileItem;
        }

        public void setProfileItem(List<ProfileItem> profileItem) {
            this.profileItem = profileItem;
        }
    }
}
