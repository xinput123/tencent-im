package com.xinput.tencent.imReq.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xinput.tencent.imResp.account.ProfileItem;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-11 17:34
 * 修改用户资料
 */
public class AccountUpdateRequest {

    /**
     * 需要设置该 Identifier 的资料
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 需要设置该 Identifier 的资料
     */
    @JsonProperty("ProfileItem")
    private List<ProfileItem> profileItems;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<ProfileItem> getProfileItems() {
        return profileItems;
    }

    public void setProfileItems(List<ProfileItem> profileItems) {
        this.profileItems = profileItems;
    }

}
