package com.yichun.havinblog.dto.request;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 说明：
 *
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/3/31 13:18
 */
@Data
public class AddNewUserRequest extends BaseRequest {

    /**
     * 用户名称
     */
    @NotNull(message = "用户名称不能为空")
    @Length(max = 50, message = "用户名称不能超过50字")
    private String userName;
}
