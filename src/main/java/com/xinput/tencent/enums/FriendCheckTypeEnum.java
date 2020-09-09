package com.xinput.tencent.enums;

/**
 * @Author: xinput
 * @Date: 2020-02-12 17:18
 */
public enum FriendCheckTypeEnum {
    SINGLE("CheckResult_Type_Single", "单向校验好友关系"),
    BOTH("CheckResult_Type_Both", "双向校验好友关系");

    private String checkType;
    private String desc;

    FriendCheckTypeEnum(String checkType, String desc) {
        this.checkType = checkType;
        this.desc = desc;
    }

    public String getCheckType() {
        return checkType;
    }

    public String getDesc() {
        return desc;
    }
}
