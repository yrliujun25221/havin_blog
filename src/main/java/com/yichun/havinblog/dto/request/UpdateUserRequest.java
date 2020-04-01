package com.yichun.havinblog.dto.request;

import com.yichun.havinblog.dto.response.BaseResponse;
import lombok.Data;

/**
 * 说明：
 *
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/3/31 13:36
 */
@Data
public class UpdateUserRequest extends BaseResponse {

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户状态 0-有效 1-失效
     */
    private String status;

}
