package com.apiDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/16 7:51 下午
 * @Description:
 *          构造方法：
 *              SimpleDateFormat() //使用默认模式进行对象的构建
 *              SimpleDateFormat(String pattern) //使用指定的模式进行对象的构建
 */
public class DataFormat {
    public static void main(String[] args) throws ParseException {
        //defaultMethod();
        patternMethod();
    }

    private static void patternMethod() throws ParseException {
        //使用指定的模式进行对象的构建
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //创建日期对象
        Date d2  = new Date();
        //格式化把日期对象转换成字符串
        String s = sdf.format(d2);
        System.out.println(s);
        //解析 把字符串转换成日期对象
        Date d3 = sdf.parse(s);
        System.out.println(d3);
    }

    private static void defaultMethod() throws ParseException {
        //使用默认的模式进行对象的构建
        SimpleDateFormat sdf = new SimpleDateFormat();
        //创建日期对象
        Date d = new Date();
        //格式化把日期对象转换成字符串
        String s = sdf.format(d);
        System.out.println(s);
        //解析 把字符串转换成日期对象
        Date d1 = sdf.parse(s);
        System.out.println(d1);
    }
}
