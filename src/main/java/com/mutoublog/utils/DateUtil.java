package com.mutoublog.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * com.mutoublog.utils
 * Created by mutou on 2017/6/20.
 */
public class DateUtil {
    /**
     * 字符串转日期
     *
     * @param dateString 字符串
     * @return date
     */
    public static Date stringToDate(String dateString) {
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
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
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
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
}