package com.yichun.havinblog.service;

import com.yichun.havinblog.dto.UserDto;
import com.yichun.havinblog.dto.request.QueryUserBaseInfoRequest;

/**
 *  用户服务
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/1/27 17:58
 */
public interface UserService {

    /**
     * 查询用户基础信息
     * @param request
     * @return
     */
    UserDto queryUserBaseInfo(QueryUserBaseInfoRequest request);
}
