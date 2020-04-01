package com.yichun.havinblog.dto.response;

import com.github.pagehelper.PageInfo;
import com.yichun.havinblog.dto.UserDto;
import lombok.Builder;
import lombok.Data;

/**
 * 说明：
 *
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/3/31 14:57
 */
@Data
@Builder
public class QueryUserPageResponse extends BaseResponse {

    /**
     * 分页用户信息
     */
    private PageInfo<UserDto> pageInfo;
}
