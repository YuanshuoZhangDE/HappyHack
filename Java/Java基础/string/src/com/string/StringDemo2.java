package com.string;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/3 5:40 下午
 * @Description:
 *      String类的获取功能
 *          int length(): 获取字符串的长度，字符的个数
 *          char charAt(int index): 获取指定索引处的字符
 *          int indexOf(String str): 获取str在字符串对象中第一次出现的索引
 *          String subString(int start): 从start开始截取字符
 *          String subString(int statr, int end): 从start开始，到end结束截取字符串
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String str = "helloworld";

        //int length(): 获取字符串的长度，字符的个数
        System.out.println(str.length());
        //char charAt(int index): 获取指定索引处的字符
        System.out.println(str.charAt(9));
        //int indexOf(String str): 获取str在字符串对象中第一次出现的索引
        System.out.println(str.indexOf("l"));
        //String subString(int start): 从start开始截取字符
        System.out.println(str.substring(5));
        //String subString(int statr, int end): 从start开始，到end结束截取字符串
        System.out.println(str.substring(5,7));
    }

}
