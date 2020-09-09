package com.xinput.tencent.enums;

/**
 * @Author: xinput
 * @Date: 2020-02-11 15:54
 */
public enum SyncFromOldSystemEnum {

    READ(1, "表示实时消息导入，消息加入未读计数"),
    UNREAD(2, "表示历史消息导入，消息不计入未读");

    private Integer sync;

    private String desc;

    SyncFromOldSystemEnum(Integer sync, String desc) {
        this.sync = sync;
        this.desc = desc;
    }

    public Integer getSync() {
        return sync;
    }

    public String getDesc() {
        return desc;
    }
}
