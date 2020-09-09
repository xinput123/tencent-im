package com.xinput.tencent;

import com.google.common.collect.Lists;
import com.xinput.tencent.enums.MsgTypeEnum;
import com.xinput.tencent.imReq.message.MsgBatchRequest;
import com.xinput.tencent.imReq.message.MsgBody;
import com.xinput.tencent.imReq.message.MsgContent;
import com.xinput.tencent.imReq.message.MsgImportRequest;
import com.xinput.tencent.imReq.message.MsgRequest;
import com.xinput.tencent.imReq.message.MsgWithDrawRequest;
import com.xinput.tencent.imReq.message.TeamMsgRequest;
import com.xinput.tencent.imReq.message.TeamMsgWithDrawRequest;
import com.xinput.tencent.imResp.message.MsgBatchResponse;
import com.xinput.tencent.imResp.message.MsgResponse;
import com.xinput.tencent.imResp.message.MsgWithDrawResponse;
import com.xinput.tencent.imResp.message.TeamMsgResponse;
import com.xinput.tencent.imResp.message.TeamMsgWithDrawResponse;
import com.xinput.tencent.util.DateUtils;

/**
 * @Author: xinput
 * @Date: 2020-02-11 15:31
 */
public class MsgApi {

    /**
     * 发送消息接口: 单聊,指定发送人
     */
    public static MsgResponse sendMessage(String fromAccountId, String toAccountId, String msg) {
        MsgContent content = new MsgContent();
        content.setText(msg);

        MsgBody msgBody = new MsgBody();
        msgBody.setMsgType(MsgTypeEnum.TIM_TEXT_ELEM.getMsgType());
        msgBody.setMsgContent(content);

        MsgRequest request = new MsgRequest();
        // 消息同步到fromAccount账号上
        request.setSyncOtherMachine(1);
        request.setFromAccount(fromAccountId);
        request.setToAccount(toAccountId);
        request.setMsgBody(Lists.newArrayList(msgBody));
        request.setMsgRandom(DateUtils.getSecond());
        request.setMsgTimeStamp((int) (System.currentTimeMillis() / 1000L));

        return sendMessage(request);
    }

    /**
     * 发送消息接口: 单聊,不指定发送人
     */
    public static MsgResponse sendMessage(String toAccountId, String msg) {
        MsgContent content = new MsgContent();
        content.setText(msg);

        MsgBody msgBody = new MsgBody();
        msgBody.setMsgType(MsgTypeEnum.TIM_TEXT_ELEM.getMsgType());
        msgBody.setMsgContent(content);

        MsgRequest request = new MsgRequest();
        // 消息同步到fromAccount账号上
        request.setSyncOtherMachine(1);
        request.setToAccount(toAccountId);
        request.setMsgBody(Lists.newArrayList(msgBody));
        request.setMsgRandom(DateUtils.getSecond());
        request.setMsgTimeStamp((int) (System.currentTimeMillis() / 1000L));

        return sendMessage(request);
    }

    /**
     * 发送消息接口: 单聊
     */
    public static MsgResponse sendMessage(MsgRequest msgRequest) {
        if (msgRequest.getMsgTimeStamp() == null) {
            msgRequest.setMsgTimeStamp(DateUtils.getUnixSecond());
        }

        if (msgRequest.getSyncOtherMachine() == null) {
            // 消息同步到fromAccount账号上
            msgRequest.setSyncOtherMachine(1);
        }

        if (msgRequest.getMsgLifeTime() == null) {
//            msgRequest.setMsgLifeTime(60 * 60 * 24 * 24);
            msgRequest.setMsgLifeTime(60 * 60);
        }

        String url = "https://console.tim.qq.com/v4/openim/sendmsg?";
        return TencentApi.baseRequest(url, msgRequest, MsgResponse.class);
    }

    /**
     * 发送消息接口: 单批量
     */
    public static MsgBatchResponse sendBatchMessage(MsgBatchRequest batchMessage) {
        if (batchMessage.getSyncOtherMachine() == null) {
            // 消息同步到fromAccount账号上
            batchMessage.setSyncOtherMachine(1);
        }

        String url = "https://console.tim.qq.com/v4/openim/batchsendmsg?";
        return TencentApi.baseRequest(url, batchMessage, MsgBatchResponse.class);
    }

    /**
     * 导入历史消息
     */
    public static MsgResponse importMessage(MsgImportRequest importMessage) {
        String url = "https://console.tim.qq.com/v4/openim/importmsg?";
        return TencentApi.baseRequest(url, importMessage, MsgResponse.class);
    }

    /**
     * 撤回历史消息
     */
    public static MsgWithDrawResponse withDraw(MsgWithDrawRequest withDraw) {
        String url = "https://console.tim.qq.com/v4/openim/admin_msgwithdraw?";
        return TencentApi.baseRequest(url, withDraw, MsgWithDrawResponse.class);
    }

    /**
     * 在群组中发送普通消息
     */
    public static TeamMsgResponse sendTeamMessage(String groupId, String speakId, String msg) {
        MsgContent content = new MsgContent();
        content.setText(msg);

        MsgBody msgBody = new MsgBody();
        msgBody.setMsgType(MsgTypeEnum.TIM_TEXT_ELEM.getMsgType());
        msgBody.setMsgContent(content);

        TeamMsgRequest request = new TeamMsgRequest();
        request.setGroupId(groupId);
        request.setFromAccount(speakId);
        request.setRandom(DateUtils.getSecond());
        request.setMsgBody(Lists.newArrayList(msgBody));
        return sendTeamMessage(request);
    }

    /**
     * 在群组中发送普通消息
     */
    public static TeamMsgResponse sendTeamMessage(TeamMsgRequest request) {
        String url = "https://console.tim.qq.com/v4/group_open_http_svc/send_group_msg?";
        return TencentApi.baseRequest(url, request, TeamMsgResponse.class);
    }

    /**
     * 撤回群组消息
     */
    public static TeamMsgWithDrawResponse withDrawTeamMsg(TeamMsgWithDrawRequest request) {
        String url = "https://console.tim.qq.com/v4/group_open_http_svc/group_msg_recall?";
        return TencentApi.baseRequest(url, request, TeamMsgWithDrawResponse.class);
    }

    /**
     * 拉取群漫游消息
     */
}
