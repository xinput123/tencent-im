package com.xinput.tencent.enums;

/**
 * @Author: xinput
 * @Date: 2020-02-11 19:51
 * 加好友方式
 */
public enum AddTypeEnum {

    SINGLE("Add_Type_Single", "表示单向加好友"),
    BOTH("Add_Type_Both", "表示双向加好友");

    private String addType;

    private String desc;

    AddTypeEnum(String addType, String desc) {
        this.addType = addType;
        this.desc = desc;
    }

    public String getAddType() {
        return addType;
    }

    public String getDesc() {
        return desc;
    }
}
