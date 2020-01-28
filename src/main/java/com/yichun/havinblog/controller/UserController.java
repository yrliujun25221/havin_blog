package com.yichun.havinblog.controller;

import com.yichun.havinblog.dto.request.QueryUserBaseInfoRequest;
import com.yichun.havinblog.dto.response.CommonResponse;
import com.yichun.havinblog.dto.response.QueryUserBaseInfoResponse;
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
     * 到登陆页面
     * @return
     */
    @RequestMapping("/toLoginPage")
    public String toLoginPage() {
        return "login";
    }

    /**
     * 查询用户基础信息
     * @param request
     * @return
     */
    @RequestMapping("/queryUserBaseInfo")
    public CommonResponse<QueryUserBaseInfoResponse> queryUserBaseInfo(QueryUserBaseInfoRequest request) {
        QueryUserBaseInfoResponse response = QueryUserBaseInfoResponse.builder()
                .userDto(this.userService.queryUserBaseInfo(request))
                .build();
        return CommonResponse.<QueryUserBaseInfoResponse>builder().data(response).build();
    }
}
