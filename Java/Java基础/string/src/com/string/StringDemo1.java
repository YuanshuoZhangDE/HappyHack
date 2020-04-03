package com.string;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/3 4:55 下午
 * @Description:
 *      String类的判断功能：
 *          boolean equals(Object obj):比较字符串的内容是否相同
 *          boolean equalsIgnoreCase(String str):比较字符串的内容是否相同，忽略大小写
 *          boolean startsWith(String str):判断字符串是否以指定的str开头
 *          boolean endsWith(String str):判断字符串对象是否以指定的str结尾
 */
public class StringDemo1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "hello";

        //boolean equals(Object obj):比较字符串的内容是否相同
        System.out.println(str1.equals(str2));

        //boolean equalsIgnoreCase(String str):比较字符串的内容是否相同，忽略大小写
        System.out.println(str1.equals(str2));

        //boolean startsWith(String str):判断字符串是否以指定的str开头
        System.out.println(str1.startsWith("H"));

        //boolean endsWith(String str):判断字符串对象是否以指定的str结尾
        System.out.println(str1.endsWith("e"));
    }
}
