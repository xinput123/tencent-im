package com.xinput.tencent.imReq.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-11 17:03
 */
public class AccountQueryRequest {

    /**
     * 需要拉取这些 Identifier 的资料；
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    /**
     * 指定要拉取的资料字段的 Tag，支持的字段见：
     * {@link com.xinput.tencent.enums.TagPortraitEnum}
     */
    @JsonProperty("TagList")
    private List<String> tagList;

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }
}
