package com.yichun.havinblog.service.impl;

import com.yichun.havinblog.dao.UserMapper;
import com.yichun.havinblog.dto.UserDto;
import com.yichun.havinblog.dto.converter.UserConverter;
import com.yichun.havinblog.dto.request.QueryUserBaseInfoRequest;
import com.yichun.havinblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户service服务层
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/1/27 17:59
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto queryUserBaseInfo(QueryUserBaseInfoRequest request) {
        return UserConverter.convertToDto(this.userMapper.selectByPrimaryKey(request.getUserId()));
    }
}
