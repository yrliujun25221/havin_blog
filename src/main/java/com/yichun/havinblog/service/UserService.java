package com.yichun.havinblog.service;

import com.github.pagehelper.PageInfo;
import com.yichun.havinblog.dto.UserDto;
import com.yichun.havinblog.model.User;
import com.yichun.havinblog.model.condition.UserCondition;

/**
 *  用户服务
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/1/27 17:58
 */
public interface UserService {

    /**
     * 查询用户基础信息
     * @param userId
     * @return
     */
    UserDto queryUserBaseInfo(String userId);

    /**
     * 新增一个用户
     * @param user
     */
    void insertUser(User user);

    /**
     * 更新用户信息
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param userId
     */
    void deleteUser(String userId);

    /**
     * 分页查询用户列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<UserDto> queryUserPage(int pageNum, int pageSize, UserCondition condition);
}
