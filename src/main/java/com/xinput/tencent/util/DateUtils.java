package com.xinput.tencent.util;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

/**
 * @Author: xinput
 * @Date: 2020-02-12 15:05
 */
public class DateUtils extends com.xinput.bleach.util.DateUtils {

    /**
     * 当前时间在今天中过去了多少秒
     */
    public static int getSecond() {
        return LocalTime.now().toSecondOfDay();
    }

    /**
     * UNIX 时间戳（单位：毫秒）
     */
    public static long getUnixMilliSecond() {
        return LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
    }

    /**
     * UNIX 时间戳（单位：秒）
     */
    public static int getUnixSecond() {
        return (int) LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
    }

}
