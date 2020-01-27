package com.yichun.havinblog.dto.response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 说明：
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/1/27 18:56
 */
@Data
@Builder
public class CommonResponse<T> implements Serializable {

    private static final long serialVersionUID = -352778026764368519L;

    private T data;

    private String errorCode;

    private String errorMessage;
}
