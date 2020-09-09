package com.xinput.tencent.imReq.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 账号检查
 */
public class AccountCheckRequest {

    @JsonProperty("CheckItem")
    private List<AccountItem> checkItems;

    public List<AccountItem> getCheckItems() {
        return checkItems;
    }

    public void setCheckItems(List<AccountItem> checkItems) {
        this.checkItems = checkItems;
    }
}
