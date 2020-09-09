package com.xinput.tencent.imResp.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xinput.tencent.imReq.account.AccountState;
import com.xinput.tencent.imResp.TencentApiResponse;

import java.util.List;

/**
 * 获取用户在线状态
 *
 * @author xinput
 */
public class AccountQueryStateResponse extends TencentApiResponse {

    /**
     * 返回的用户在线状态结构化信息
     */
    @JsonProperty("QueryResult")
    private List<AccountState> resultBeans;

    public List<AccountState> getResultBeans() {
        return resultBeans;
    }

    public void setResultBeans(List<AccountState> resultBeans) {
        this.resultBeans = resultBeans;
    }

}
