package com.yichun.havinblog.dto.request;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 说明：
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/3/31 13:46
 */
@Data
public class DeleteUserRequest extends BaseRequest {

    /**
     * 用户id
     */
    @NotNull(message = "用户id不能为空")
    private String userId;
}
