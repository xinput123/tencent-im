package com.xinput.tencent.enums;

/**
 * @Author: xinput
 * @Date: 2020-02-11 23:47
 * 获取客户标配资料字段
 */
public enum TagPortraitEnum {

    // 昵称
    NICK("Tag_Profile_IM_Nick"),

    // 性别
    GENDER("Tag_Profile_IM_Gender"),

    // 出生日期
    BIRTHDAY("Tag_Profile_IM_BirthDay"),

    // 所在地
    LOCATION("Tag_Profile_IM_Location"),

    // 个性签名
    SELF_SIGNATURE("Tag_Profile_IM_SelfSignature"),

    /**
     * 加好友验证方式:
     * AllowType_Type_NeedConfirm: 需要经过自己确认才能添加自己为好友
     * AllowType_Type_AllowAny: 允许任何人添加自己为好友
     * AllowType_Type_DenyAny: 不允许任何人添加自己为好友
     */
    ALLOW_TYPE("Tag_Profile_IM_AllowType"),

    // 语言
    LANGUAGE("Tag_Profile_IM_Language"),

    // 头像
    IMAGE("Tag_Profile_IM_Image"),

    // 消息设置: 置0表示接收消息，置1则不接收消息
    MSG_SETTINGS("Tag_Profile_IM_MsgSettings"),

    /**
     * 管理员禁止加好友标识
     * AdminForbid_Type_None：默认值，允许加好友
     * AdminForbid_Type_SendOut：禁止该用户发起加好友请求
     */
    ADMIN_FORBID_TYPE("Tag_Profile_IM_AdminForbidType"),

    // 通常一个 UINT-8 数据即可保存一个角色信息. 您可以考虑拆分保存，从而保存多种角色信息
    ROLE("Tag_Profile_IM_Role");

    private String tag;

    TagPortraitEnum(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

}
