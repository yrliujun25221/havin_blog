package com.yichun.havinblog.model.condition;

import com.yichun.havinblog.model.User;
import lombok.Builder;

import java.util.Date;

/**
 * 说明：
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/3/31 14:22
 */
@Builder
public class UserCondition extends User {

    private Date createTimeMax;

    private Date createTimeMin;

}
