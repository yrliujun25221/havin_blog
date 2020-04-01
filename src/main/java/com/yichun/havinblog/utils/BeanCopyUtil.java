package com.yichun.havinblog.utils;

import org.springframework.beans.BeanUtils;

import java.io.Serializable;

/**
 * 说明：属性复制工具类
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/1/27 18:43
 */
public class BeanCopyUtil implements Serializable {

    public static <D,T> D beanCopy(T source, D target) {
        BeanUtils.copyProperties(source, target);
        return target;
    }
}
