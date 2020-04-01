package com.yichun.havinblog.dto.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 说明：
 *
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/3/30 17:08
 */
@Getter
@AllArgsConstructor
public enum RoleEnum {

    ADMIN("0","平台超级管理员"),
    USER("1","用户");

    private String code;
    private String name;
}
