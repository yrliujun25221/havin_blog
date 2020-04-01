package com.yichun.havinblog.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.yichun.havinblog.dao.UserMapper;
import com.yichun.havinblog.dto.UserDto;
import com.yichun.havinblog.dto.converter.UserConverter;
import com.yichun.havinblog.dto.enums.RoleEnum;
import com.yichun.havinblog.dto.enums.ValidStatusEnum;
import com.yichun.havinblog.model.User;
import com.yichun.havinblog.model.condition.UserCondition;
import com.yichun.havinblog.model.example.UserExample;
import com.yichun.havinblog.service.UserService;
import com.yichun.havinblog.utils.BeanCopyUtil;
import com.yichun.havinblog.utils.DateUtil;
import com.yichun.havinblog.utils.IdGeneratorFactory;
import com.yichun.havinblog.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 用户service服务层
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/1/27 17:59
 */
@Service
public class UserServiceImpl implements UserService {

    private final String DEFAULT_PASSWORD = "123456";

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto queryUserBaseInfo(String userId) {
        User user = this.userMapper.selectByPrimaryKey(userId);
        if(Objects.isNull(user)) {
            return UserDto.builder().build();
        }
        return UserConverter.convertToDto(user);
    }

    @Override
    public void insertUser(User user) {
        user.setUserId(IdGeneratorFactory.nextId());
        user.setPassword(DEFAULT_PASSWORD);
        user.setCreateTime(DateUtil.getSysTime());
        user.setRole(RoleEnum.USER.getCode());
        user.setStatus(ValidStatusEnum.VALID.getCode());
        user.setVersion("0");
        this.userMapper.insertSelective(user);
    }

    @Override
    public void updateUser(User user) {
        this.userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void deleteUser(String userId) {
        this.userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public PageInfo<UserDto> queryUserPage(int pageNum, int pageSize, UserCondition condition) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if(StringUtil.isNotEmpty(condition.getStatus())) {
            criteria.andStatusEqualTo(condition.getStatus());
        }
        if(StringUtil.isNotEmpty(condition.getUserName())) {
            criteria.andUserNameLike(condition.getUserName());
        }
        PageHelper.startPage(pageNum, pageSize);
        Page<User> page = (Page<User>)this.userMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(page.toPageInfo().getList())) {
            return new PageInfo<>();
        }
        return PageUtil.toDtoPageInfo(page.toPageInfo(), UserConverter::convertToDto);
    }
}
