package com.string;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/3 9:45 下午
 * @Description:
 *          去除字符串两端空格
 *              String trim()
 *          按照指定符号分割字符串
 *              String[] split(String str)
 */
public class StringDemo4 {
    public static void main(String[] args) {
        String str1 = "     hello word   ";
        System.out.println(str1.trim());
        String str2 = "he,ll,o,wo,rld";
        String[] strArray = str2.split(",");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
