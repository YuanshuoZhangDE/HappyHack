package com.string;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/3 9:30 下午
 * @Description:
 *      String类的转换功能
 *          char[] toCharArraay(): 把字符串转换为字符数组
 *          String toLowerCase(): 把字符串转换为小写字符串
 *          String toUpperCase(): 把字符串转换为大写字符串
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String str = "abcde";
        //char[] toCharArraay(): 把字符串转换为字符数组
        char[] chs = str.toCharArray();
        System.out.println(chs);
        //String toLowerCase(): 把字符串转换为小写字符串
        System.out.println(str.toUpperCase());
        //String toUpperCase(): 把字符串转换为大写字符串
        System.out.println("HELLO".toLowerCase());
    }
}
