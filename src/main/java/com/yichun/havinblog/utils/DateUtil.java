package com.yichun.havinblog.utils;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 说明：时间工具类
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/1/27 19:05
 */
public class DateUtil implements Serializable {

    /**
     * 返回当前时间
     * @return
     */
    public static Date getSysTime() {
        return new Date();
    }

    /**
     * 返回yyyyMMddHHmmssSSS 格式的系统时间
     * @return
     */
    public static String getEnSysDay() {
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return df.format(new Date());
    }
}
