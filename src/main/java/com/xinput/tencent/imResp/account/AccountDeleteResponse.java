package com.xinput.tencent.imResp.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xinput.tencent.imResp.TencentApiResponse;

import java.util.List;

/**
 * 删除账号
 * <p>
 * 仅支持删除体验版帐号。
 * 帐号删除时，该用户的关系链、资料等数据也会被删除。
 * 帐号删除后，该用户的数据将无法恢复，请谨慎使用该接口。
 *
 * @author xinput
 */
public class AccountDeleteResponse extends TencentApiResponse {

    @JsonProperty("ResultItem")
    private List<ResultItem> resultItems;

    public List<ResultItem> getResultItems() {
        return resultItems;
    }

    public void setResultItems(List<ResultItem> resultItems) {
        this.resultItems = resultItems;
    }
}
