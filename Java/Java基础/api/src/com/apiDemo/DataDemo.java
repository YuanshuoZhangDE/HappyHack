package com.apiDemo;

import java.util.Date;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/15 9:57 下午
 * @Description:
 *      Date:表示特定时间，精确到毫秒,可以通过方法来设定自己所表示的时间，可以表示任意时间
 *      构造方法：
 *          Date()：创建的是一个表示当前系统时间的Data对象
 *          Date(long date)：根据"指定时间"创建Date对象
 */
public class DataDemo {
    public static void main(String[] args) {
        //demo();
    }

    private static void demo() {
        //无参构造，默认当前系统时间
        Date d = new Date();
        System.out.println(d.toString());
        System.out.println(d.toLocaleString());
        //有参构造
        Date d2 = new Date(1000 * 60 * 60 * 24); //70年一月一号 ， 加上括号内的时间， 以毫秒为单位，要 x1000
        System.out.println(d2.toLocaleString());
    }
}
