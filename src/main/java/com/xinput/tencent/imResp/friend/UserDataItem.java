package com.xinput.tencent.imResp.friend;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-12 17:54
 */
public class UserDataItem {

    /**
     * 好友的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 保存好友数据的数组，数组每一个元素都包含一个 Tag 字段和一个 Value 字段
     */
    @JsonProperty("ValueItem")
    private List<ValueItem> valueItems;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public List<ValueItem> getValueItems() {
        return valueItems;
    }

    public void setValueItems(List<ValueItem> valueItems) {
        this.valueItems = valueItems;
    }
}
