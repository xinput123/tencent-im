package com.xinput.tencent.imResp.friend;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xinput.tencent.imResp.TencentApiResponse;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-11 20:04
 */
public class FriendAddResponse extends TencentApiResponse {

    /**
     * 详细的客户端展示信息
     */
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    /**
     * 批量加好友的结果对象数组
     */
    @JsonProperty("ResultItem")
    private List<FriendAddResultItem> resultItems;

    /**
     * 返回处理失败的用户列表，仅当存在失败用户时才返回该字段
     */
    @JsonProperty("Fail_Account")
    private List<String> failAccount;

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    public List<FriendAddResultItem> getResultItems() {
        return resultItems;
    }

    public void setResultItems(List<FriendAddResultItem> resultItems) {
        this.resultItems = resultItems;
    }

    public List<String> getFailAccount() {
        return failAccount;
    }

    public void setFailAccount(List<String> failAccount) {
        this.failAccount = failAccount;
    }
}
