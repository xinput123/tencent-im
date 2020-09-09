package com.xinput.tencent.imReq.account;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: xinput
 * @Date: 2020-02-04 12:08
 * 账号导入
 */
public class AccountImportRequest {

    /**
     * 用户名，长度不超过 32 字节
     */
    @JsonProperty("Identifier")
    private String identifier;

    /**
     * 用户昵称
     */
    @JsonProperty("Nick")
    private String nick;

    /**
     * 用户头像URL。
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public AccountImportRequest() {
    }

    public AccountImportRequest(String identifier) {
        this.identifier = identifier;
    }
}
