package com.xinput.tencent.imReq.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 账号删除
 */
public class AccountDeleteRequest {

    @JsonProperty("DeleteItem")
    private List<AccountItem> deleteItems;

    public List<AccountItem> getDeleteItems() {
        return deleteItems;
    }

    public void setDeleteItems(List<AccountItem> deleteItems) {
        this.deleteItems = deleteItems;
    }
}
