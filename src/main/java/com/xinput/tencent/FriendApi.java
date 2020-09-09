package com.xinput.tencent;

import com.xinput.tencent.imReq.friend.FriendAddRequest;
import com.xinput.tencent.imReq.friend.FriendCheckRequest;
import com.xinput.tencent.imReq.friend.FriendListRequest;
import com.xinput.tencent.imResp.friend.FriendAddResponse;
import com.xinput.tencent.imResp.friend.FriendCheckResponse;
import com.xinput.tencent.imResp.friend.FriendListResponse;

/**
 * @Author: xinput
 * @Date: 2020-02-11 20:30
 */
public class FriendApi {

    /**
     * 添加好友
     */
    public static FriendAddResponse addFriend(FriendAddRequest add) {
        String url = "https://console.tim.qq.com/v4/sns/friend_add?";
        return TencentApi.baseRequest(url, add, FriendAddResponse.class);
    }

    /**
     * 导入好友
     */

    /**
     * 更新好友
     */

    /**
     * 删除好友
     */

    /**
     * 删除所有好友
     */

    /**
     * 校验好友
     */
    public static FriendCheckResponse check(FriendCheckRequest request) {
        String url = "https://console.tim.qq.com/v4/sns/friend_check?";
        return TencentApi.baseRequest(url, request, FriendCheckResponse.class);
    }

    /**
     * 拉取好友
     */
    public static FriendListResponse list(FriendListRequest request) {
        String url = "https://console.tim.qq.com/v4/sns/friend_get?";
        return TencentApi.baseRequest(url, request, FriendListResponse.class);
    }

    /**
     * 拉取指定好友
     */

    /**
     * 添加黑名单
     */

    /**
     * 删除黑名单
     */

    /**
     * 拉取黑名单
     */

    /**
     * 添加分组
     */

    /**
     * 删除分组
     */
}
