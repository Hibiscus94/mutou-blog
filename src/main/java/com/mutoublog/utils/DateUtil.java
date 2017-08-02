package com.mutoublog.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * com.mutoublog.utils
 * Created by mutou on 2017/6/20.
 */
public class DateUtil {

    /**
     * DAY_FORMAT yyyy-MM-dd 时间格式
     */
    public static final String DAY_FORMAT = "yyyy-MM-dd";

    /**
     * DATE_FORMAT yyyy-MM-dd HH:mm:ss 时间格式
     */
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 字符串转日期
     *
     * @param dateString 字符串
     * @return date
     */
    public static Date stringToDate(String dateString) {
        Date date = null;
        try {
            date = new SimpleDateFormat(DATE_FORMAT).parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 日期转字符串
     *
     * @param date 日期
     * @param type 类型
     * @return String
     */
    public static String dateToString(Date date, String type) {
        String str;
        DateFormat format = new SimpleDateFormat(DATE_FORMAT);
        switch (type) {
            case "SHORT":
                // 07-1-18
                format = DateFormat.getDateInstance(DateFormat.SHORT);
                str = format.format(date);
                break;
            case "MEDIUM":
                // 2007-1-18
                format = DateFormat.getDateInstance(DateFormat.MEDIUM);
                str = format.format(date);
                break;
            case "FULL":
                // 2007年1月18日 星期四
                format = DateFormat.getDateInstance(DateFormat.FULL);
                str = format.format(date);
                break;
            default:
                str = format.format(date);
                break;
        }
        return str;
    }

    /**
     * 获取时间格式
     *
     * @param time 时间
     * @return String
     */
    public static String getTimeFormat(String time) {
        return getTimeFormat(stringToDate(time));
    }

    /**
     * 获取日期几分钟前，几年前
     *
     * @param time 时间
     * @return String
     */
    public static String getTimeFormat(Date time) {
        try {
            long startTimeMills = time.getTime();
            long endTimeMills = System.currentTimeMillis();
            long diff = (endTimeMills - startTimeMills) / 1000;//秒
            long day_diff = (long) Math.floor(diff / 86400);//天
            StringBuilder builder = new StringBuilder();
            if (day_diff < 0) {
                return "[error],时间越界...";
            } else {
                if (day_diff == 0 && diff < 60) {
                    if (diff == 0) diff = 1;
                    builder.append(diff).append("秒前");
                } else if (day_diff == 0 && diff < 120) {
                    builder.append("1 分钟前");
                } else if (day_diff == 0 && diff < 3600) {
                    builder.append(Math.round(Math.floor(diff / 60))).append("分钟以前");
                } else if (day_diff == 0 && diff < 7200) {
                    builder.append("1小时前");
                } else if (day_diff == 0 && diff < 86400) {
                    builder.append(Math.round(Math.floor(diff / 3600))).append("小时前");
                } else if (day_diff == 1) {
                    builder.append("1天前");
                } else if (day_diff < 7) {
                    builder.append(day_diff).append("天前");
                } else if (day_diff < 30) {
                    builder.append(Math.round(Math.ceil(day_diff / 7))).append(" 星期前");
                } else if (day_diff <= 179) {
                    builder.append(Math.round(Math.ceil(day_diff / 30))).append("月前");
                } else if (day_diff < 365) {
                    builder.append("半年前");
                } else {
                    builder.append(Math.round(Math.ceil(day_diff / 30 / 12))).append("年前");
                }
            }
            return builder.toString();
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * <p> 创建一个{@link #DATE_FORMAT}格式的SimpleDateFormat
     *
     * @return SimpleDateFormat
     */
    public static SimpleDateFormat getDateFormat() {
        return new SimpleDateFormat(DATE_FORMAT);
    }

    /**
     * <p> 创建一个dateFormate格式的SimpleDateFormat
     *
     * @param dateFormate 时间格式
     * @return SimpleDateFormat
     */
    public static SimpleDateFormat getDateFormat(String dateFormate) {
        return new SimpleDateFormat(dateFormate);
    }

    /**
     * <p> 判断一个字符串是否是{@link #DATE_FORMAT}时间格式
     *
     * @param dateTime {@link #DATE_FORMAT}格式的时间
     * @return 是则返回true，反之false
     */
    public static boolean isDate(String dateTime) {
        try {
            getDateFormat().parse(dateTime);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * <p> 判断一个字符串是否是{@link #DAY_FORMAT}时间格式
     *
     * @param dateTime {@link #DAY_FORMAT}格式的时间
     * @return 是则返回true，反之false
     */
    public static boolean isDay(String dateTime) {
        try {
            new SimpleDateFormat(DAY_FORMAT).parse(dateTime);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * <p> 判断一个字符串是否是dateFormate时间格式
     *
     * @param dateTime    dateFormate格式的时间
     * @param dateFormate 时间格式
     * @return 是则返回true，反之false
     */
    public static boolean isDate(String dateTime, String dateFormate) {
        try {
            getDateFormat(dateFormate).parse(dateTime);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * <p> 计算时间差
     *
     * @param before 前一个时间
     * @param after  后一个时间
     * @return 时间差
     */
    public static long dateDiff(long before, long after) {
        return after - before;
    }

    /**
     * <p> 计算时间差
     *
     * @param before 前一个时间
     * @param after  后一个时间
     * @param unit   时间单位，毫秒的倍数
     * @return 根据时间单位返回时间差
     */
    public static long dateDiff(long before, long after, long unit) {
        return (after - before) / unit;
    }

    /**
     * <p> 取当前时间的10位时间戳
     * 当前时间超过2038/01/19 11:14:07时，返回0
     *
     * @return 10位时间戳
     */
    public static int getTime() {
        int time = (int) (System.currentTimeMillis() / 1000L);
        if (time < 0) // long型转为整型时溢出
            return 0;
        return time;
    }

    public static int getTime(long millis) {
        int time = (int) (millis / 1000L);
        if (time < 0) // long型转为整型时溢出
            return 0;
        return time;
    }

    /**
     * <p> 取得{@link #DATE_FORMAT}格式的当前时间字符串
     *
     * @return 时间字符串
     */
    public static String getCurrentDate() {
        return getDateFormat().format(new Date());
    }

    /**
     * <p> 取得dateFormate格式的当前时间字符串
     *
     * @param dateFormate 时间格式
     * @return 时间字符串
     */
    public static String getCurrentDate(String dateFormate) {
        return getDateFormat(dateFormate).format(new Date());
    }

    /**
     * <p> 以{@link #DATE_FORMAT}格式化时间字符串，当字符串不符合格式时返回null
     *
     * @param dateTime {@link #DATE_FORMAT}格式的时间
     * @return 格式化的时间
     */
    public static Date formateDate(String dateTime) {
        try {
            return getDateFormat().parse(dateTime);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * <p> 以dateFormate格式化时间字符串，当字符串不符合格式时返回null
     *
     * @param dateTime    dateFormate格式的时间
     * @param dateFormate 时间格式
     * @return 格式化的时间
     */
    public static Date formateDate(String dateTime, String dateFormate) {
        try {
            return getDateFormat(dateFormate).parse(dateTime);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * <p> 以{@link #DATE_FORMAT}格式化long型时间
     *
     * @param datetime long时间
     * @return 格式化的时间
     */
    public static String formateDate(long datetime) {
        return getDateFormat().format(new Date(datetime));
    }

    /**
     * <p> 以dateFormate格式化long型时间
     *
     * @param datetime    long时间
     * @param dateFormate 时间格式
     * @return 格式化的时间
     */
    public static String formateDate(long datetime, String dateFormate) {
        return getDateFormat(dateFormate).format(new Date(datetime));
    }

    /**
     * <p> 以{@link #DATE_FORMAT}格式化时间
     *
     * @param dateTime 时间
     * @return 格式化的时间
     */
    public static String formateDate(Date dateTime) {
        return getDateFormat().format(dateTime);
    }

    /**
     * <p> 以dateFormate格式化时间
     *
     * @param dateTime    时间
     * @param dateFormate 时间格式
     * @return 格式化的时间
     */
    public static String formateDate(Date dateTime, String dateFormate) {
        return getDateFormat(dateFormate).format(dateTime);
    }

    /**
     * 获取前xx天
     * @param date 日期
     * @param day   天数
     * @return 格式化的时间
     */
    public static Date getDateBefore(Date date, int day) {
        return getDate(date, true, day);
    }

    /**
     * 获取后xx天
     * @param date 日期
     * @param day   天数
     * @return 格式化的时间
     */
    public static Date getDateAfter(Date date, int day) {
        return getDate(date, false, day);
    }

    public static Date getDate(Date date, boolean before, int day) {
        Calendar now = Calendar.getInstance();
        now.setTime(date);
        now.set(Calendar.DATE, before ? now.get(Calendar.DATE) - day : now.get(Calendar.DATE) + day);
        return now.getTime();
    }

    /**
     * 是否同一天
     * @param day1 day1
     * @param day2 day2
     * @return bool
     */
    public static boolean isSameDay(Date day1, Date day2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String ds1 = sdf.format(day1);
        String ds2 = sdf.format(day2);
        if (ds1.equals(ds2)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 是否今天
     * @param date 日期
     * @return bool
     */
    public static boolean isToday(Date date) {
        return isSameDay(date, new Date());
    }
}