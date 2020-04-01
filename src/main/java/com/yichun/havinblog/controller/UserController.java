package com.yichun.havinblog.controller;

import com.yichun.havinblog.dto.request.AddNewUserRequest;
import com.yichun.havinblog.dto.request.DeleteUserRequest;
import com.yichun.havinblog.dto.request.QueryUserBaseInfoRequest;
import com.yichun.havinblog.dto.request.QueryUserPageRequest;
import com.yichun.havinblog.dto.request.UpdateUserRequest;
import com.yichun.havinblog.dto.response.AddNewUserResponse;
import com.yichun.havinblog.dto.response.CommonResponse;
import com.yichun.havinblog.dto.response.DeleteUserResponse;
import com.yichun.havinblog.dto.response.QueryUserBaseInfoResponse;
import com.yichun.havinblog.dto.response.QueryUserPageResponse;
import com.yichun.havinblog.dto.response.UpdateUserResponse;
import com.yichun.havinblog.model.User;
import com.yichun.havinblog.model.condition.UserCondition;
import com.yichun.havinblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 说明：用户控制器
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/1/27 18:01
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询用户基础信息
     * @param request
     * @return
     */
    @RequestMapping("/queryUserBaseInfo")
    public CommonResponse<QueryUserBaseInfoResponse> queryUserBaseInfo(QueryUserBaseInfoRequest request) {
        QueryUserBaseInfoResponse response = QueryUserBaseInfoResponse.builder()
                .userDto(this.userService.queryUserBaseInfo(request.getUserId()))
                .build();
        return CommonResponse.<QueryUserBaseInfoResponse>builder().data(response).build();
    }

    /**
     * 新增一个用户
     * @param request
     * @return
     */
    @RequestMapping("/addNewUser")
    public CommonResponse<AddNewUserResponse> addNewUser(AddNewUserRequest request) {
        AddNewUserResponse response = AddNewUserResponse.builder().build();
        User user = User.builder().userName(request.getUserName()).build();
        this.userService.insertUser(user);
        return CommonResponse.<AddNewUserResponse>builder().data(response).build();
    }

    /**
     * 修改用户的基础信息
     * @param request
     * @return
     */
    @RequestMapping("/updateUser")
    public CommonResponse<UpdateUserResponse> updateUser(UpdateUserRequest request) {
        UpdateUserResponse response = UpdateUserResponse.builder().build();
        User user = User.builder().userName(request.getUserName())
                .status(request.getStatus())
                .build();
        this.userService.updateUser(user);
        return CommonResponse.<UpdateUserResponse>builder().data(response).build();
    }

    /**
     * 删除用户
     * @param request
     * @return
     */
    @RequestMapping("/deleteUser")
    public CommonResponse<DeleteUserResponse> deleteUser(DeleteUserRequest request) {
        DeleteUserResponse response = DeleteUserResponse.builder().build();
        this.userService.deleteUser(request.getUserId());
        return CommonResponse.<DeleteUserResponse>builder().data(response).build();
    }

    public CommonResponse<QueryUserPageResponse> queryUserPage(QueryUserPageRequest request) {
        UserCondition condition = UserCondition.builder().build();
        condition.setUserName(request.getUserName());
        condition.setStatus(request.getStatus());

        QueryUserPageResponse response = QueryUserPageResponse.builder()
                .pageInfo(this.userService.queryUserPage(request.getPageNum(), request.getPageSize(), condition))
                .build();
        return CommonResponse.<QueryUserPageResponse>builder().data(response).build();
    }

}
