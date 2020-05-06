package com.apiDemo;

import java.util.Calendar;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/16 8:26 下午
 * @Description:
 *      Calendar：日历，提供了一些操作年月日时的方法
 *          修改
 *          添加
 *          获取
 */
public class DateCalendar {
    public static void main(String[] args) {
        //static Calendar getInstance()
        Calendar c = Calendar.getInstance();
        //int get(int field) //返回给定日历字段的值
        //public static final int YEAR 1
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        System.out.println(year+"年"+month+"月");
    }
}
