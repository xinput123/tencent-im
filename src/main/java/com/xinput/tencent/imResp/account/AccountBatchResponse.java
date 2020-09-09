package com.xinput.tencent.imResp.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xinput.tencent.imResp.TencentApiResponse;

import java.util.List;

/**
 * 批量导入账号返回值
 *
 * @author xinput
 */
public class AccountBatchResponse extends TencentApiResponse {

    /**
     * 导入失败的帐号列表
     */
    @JsonProperty("FailAccounts")
    private List<String> failAccounts;

    public List<String> getFailAccounts() {
        return failAccounts;
    }

    public void setFailAccounts(List<String> failAccounts) {
        this.failAccounts = failAccounts;
    }

}
