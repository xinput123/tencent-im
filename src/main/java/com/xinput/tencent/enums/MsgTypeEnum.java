package com.xinput.tencent.enums;

/**
 * TIM 消息对象类型
 */
public enum MsgTypeEnum {
    TIM_TEXT_ELEM("TIMTextElem", "文本消息"),
    TIM_FACE_ELEM("TIMFaceElem", "表情消息"),
    TIM_IMAGE_ELEM("TIMImageElem", "图片消息"),
    TIM_Location_Elem("TIMLocationElem", "位置消息"),
    TIM_Custom_Elem("TIMCustomElem", "自定义消息"),
    TIM_SOUND_ELEM("TIMSoundElem", "语音消息"),
    TIM_Video_File_Elem("TIMVideoFileElem", "视频文件消息");

    private String msgType;

    private String desc;

    MsgTypeEnum(String msgType, String desc) {
        this.msgType = msgType;
        this.desc = desc;
    }

    public String getMsgType() {
        return msgType;
    }

    public String getDesc() {
        return desc;
    }
}
