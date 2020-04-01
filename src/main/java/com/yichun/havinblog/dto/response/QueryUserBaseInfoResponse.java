package com.yichun.havinblog.dto.response;

import com.yichun.havinblog.dto.UserDto;
import lombok.Builder;
import lombok.Data;

/**
 * 说明：查询用户基础信息响应类
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/1/27 18:29
 */
@Data
@Builder
public class QueryUserBaseInfoResponse extends BaseResponse {

    private UserDto userDto;
}
