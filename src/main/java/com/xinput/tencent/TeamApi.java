package com.xinput.tencent;

import com.google.common.collect.Lists;
import com.xinput.tencent.enums.TeamTypeEnum;
import com.xinput.tencent.imReq.team.TeamAddMemberRequest;
import com.xinput.tencent.imReq.team.TeamBaseInfoRequest;
import com.xinput.tencent.imReq.team.TeamCreateRequest;
import com.xinput.tencent.imReq.team.TeamDetailRequest;
import com.xinput.tencent.imReq.team.TeamListRequest;
import com.xinput.tencent.imReq.team.TeamRemoveMemberRequest;
import com.xinput.tencent.imResp.team.TeamAddMemberResponse;
import com.xinput.tencent.imResp.team.TeamBaseInfoResponse;
import com.xinput.tencent.imResp.team.TeamCreateResponse;
import com.xinput.tencent.imResp.team.TeamDetailResponse;
import com.xinput.tencent.imResp.team.TeamListResponse;
import com.xinput.tencent.imResp.team.TeamRemoveMemberResponse;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2020-02-08 20:38
 * @Versioin: 1.0.0
 */
public class TeamApi {

    /**
     * 获取App中的所有群组
     */
    public static TeamListResponse list(TeamListRequest request) {
        String url = "https://console.tim.qq.com/v4/group_open_http_svc/get_appid_group_list?";
        return TencentApi.baseRequest(url, request, TeamListResponse.class);
    }

    /**
     * 创建群组
     */
    public static TeamCreateResponse create(String ownerAccount, String groupId, String groupName) {
        TeamCreateRequest request = new TeamCreateRequest();
        request.setName(groupName);
        request.setGroupId(groupId);
        request.setOwnerAccount(ownerAccount);
        request.setType(TeamTypeEnum.PUBLIC.getTeamType());

        return create(request);
    }

    /**
     * 创建群组
     */
    public static TeamCreateResponse create(TeamCreateRequest request) {
        String url = "https://console.tim.qq.com/v4/group_open_http_svc/create_group?";
        return TencentApi.baseRequest(url, request, TeamCreateResponse.class);
    }

    /**
     * 群组信息
     */
    public static TeamDetailResponse detail(TeamDetailRequest request) {
        String url = "https://console.tim.qq.com/v4/group_open_http_svc/get_group_info?";
        return TencentApi.baseRequest(url, request, TeamDetailResponse.class);
    }

    /**
     * 修改群组基础资料-群组名称
     */
    public static TeamBaseInfoResponse updateTeamName(String groupId, String groupName) {
        TeamBaseInfoRequest request = new TeamBaseInfoRequest();
        request.setGroupId(groupId);
        request.setName(groupName);
        return updateTeamBaseInfo(request);
    }

    /**
     * 修改群组基础资料
     */
    public static TeamBaseInfoResponse updateTeamBaseInfo(TeamBaseInfoRequest request) {
        String url = "https://console.tim.qq.com/v4/group_open_http_svc/modify_group_base_info?";
        return TencentApi.baseRequest(url, request, TeamBaseInfoResponse.class);
    }

    /**
     * 增加群组成员
     */
    public static TeamAddMemberResponse addMember(String groupId, List<String> accountIds) {
        List<TeamAddMemberRequest.Member> members = Lists.newArrayListWithCapacity(accountIds.size());
        accountIds.forEach(accountId -> {
            TeamAddMemberRequest.Member member = new TeamAddMemberRequest.Member();
            member.setMemberAccount(accountId);
            members.add(member);
        });

        TeamAddMemberRequest request = new TeamAddMemberRequest();
        request.setGroupId(groupId);
        request.setSilence(1);
        request.setMembers(members);

        return addMember(request);
    }

    /**
     * 增加群组成员
     */
    public static TeamAddMemberResponse addMember(TeamAddMemberRequest request) {
        String url = "https://console.tim.qq.com/v4/group_open_http_svc/add_group_member?";
        return TencentApi.baseRequest(url, request, TeamAddMemberResponse.class);
    }

    /**
     * 删除群组成员
     */
    public static TeamRemoveMemberResponse removeMember(TeamRemoveMemberRequest request) {
        String url = "https://console.tim.qq.com/v4/group_open_http_svc/delete_group_member?";
        return TencentApi.baseRequest(url, request, TeamRemoveMemberResponse.class);
    }

    /**
     *解散群组
     */

    /**
     *获取用户所加入的群组
     */

    /**
     *查询用户在群组中的身份
     */

    /**
     *批量禁言和取消禁言
     */

    /**
     *获取群组被禁言用户列表
     */

    /**
     *转让群组
     */

    /**
     *导入群基本资料
     */

    /**
     * 导入群消息
     */

    /**
     * 导入群成员
     */

    /**
     * 设置成员未读消息计数
     */

    /**
     * 删除指定用户发送的消息
     */

}
