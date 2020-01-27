package com.yichun.havinblog.dto.request;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 说明：查询用户基础信息请求类
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/1/27 18:05
 */
@Data
@Builder
public class QueryUserBaseInfoRequest extends BaseRequest {

    private static final long serialVersionUID = 6922488698173960732L;

    /**
     * 用户id
     */
    private String userId;
}
