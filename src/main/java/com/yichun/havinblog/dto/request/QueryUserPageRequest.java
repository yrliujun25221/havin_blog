package com.yichun.havinblog.dto.request;

import lombok.Data;

/**
 * 说明：
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/3/31 14:58
 */
@Data
public class QueryUserPageRequest extends BaseRequest {

    private Integer pageNum;

    private Integer pageSize;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户状态 0-有效 1-失效
     */
    private String status;
}
