package com.xinput.tencent.imReq.message;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 离线推送信息配置
 */
public class OfflinePushInfo {

    /**
     * 0表示推送，1表示不离线推送。
     */
    @JsonProperty("PushFlag")
    private Integer pushFlag;

    /**
     * 离线推送标题。该字段为ios和android共用
     */
    @JsonProperty("Title")
    private String title;

    /**
     * 离线推送内容
     */
    @JsonProperty("Desc")
    private String desc;

    /**
     * 离线推送透传内容。
     */
    @JsonProperty("Ext")
    private String ext;

    @JsonProperty("ApnsInfo")
    private ApnsInfo apnsInfo;

    class ApnsInfo {
        /**
         * 这个字段缺省或者为 0 表示需要计数，
         * 为 1 表示本条消息不需要计数，即右上角图标数字不增加
         */
        @JsonProperty("BadgeMode")
        private Integer badgeMode;
        /**
         * 离线推送声音文件路径。
         */
        @JsonProperty("Sound")
        private String sound;

        /**
         * 该字段用于标识apns推送的标题，若填写则会覆盖最上层Title
         */
        @JsonProperty("Title")
        private String title;

        /**
         * 该字段用于标识apns推送的子标题
         */
        @JsonProperty("SubTitle")
        private String subTitle;

        /**
         * 该字段用于标识apns携带的图片地址，当客户端拿到该字段时，
         * 可以通过下载图片资源的方式将图片展示在弹窗上
         */
        @JsonProperty("Image")
        private String image;

        public Integer getBadgeMode() {
            return badgeMode;
        }

        public void setBadgeMode(Integer badgeMode) {
            this.badgeMode = badgeMode;
        }

        public String getSound() {
            return sound;
        }

        public void setSound(String sound) {
            this.sound = sound;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubTitle() {
            return subTitle;
        }

        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }

    public Integer getPushFlag() {
        return pushFlag;
    }

    public void setPushFlag(Integer pushFlag) {
        this.pushFlag = pushFlag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public ApnsInfo getApnsInfo() {
        return apnsInfo;
    }

    public void setApnsInfo(ApnsInfo apnsInfo) {
        this.apnsInfo = apnsInfo;
    }
}
