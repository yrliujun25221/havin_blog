package com.yichun.havinblog.dto.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 说明：
 *
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/3/30 17:10
 */
@Getter
@AllArgsConstructor
public enum ValidStatusEnum {

    VALID("0","有效"),
    INVALID("1","失效");

    private String code;
    private String name;
}
