package com.yichun.havinblog.utils;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * 说明：id生成器
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/3/30 16:56
 */
@Slf4j
public class IdGeneratorFactory implements Serializable {

    public static String nextId() {
        return DateUtil.getEnSysDay();
    }
}
