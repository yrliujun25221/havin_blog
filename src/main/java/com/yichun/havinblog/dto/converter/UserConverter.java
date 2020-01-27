package com.yichun.havinblog.dto.converter;

import com.yichun.havinblog.dto.UserDto;
import com.yichun.havinblog.model.User;
import com.yichun.havinblog.utils.BeanCopyUtil;
import org.springframework.beans.BeanUtils;

/**
 * 说明：do => dto 转换器
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/1/27 18:39
 */
public class UserConverter {

    public static UserDto convertToDto(User source) {
        return BeanCopyUtil.beanCopy(source, UserDto.builder().build());
    }
}
