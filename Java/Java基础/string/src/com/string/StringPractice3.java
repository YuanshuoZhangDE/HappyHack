package com.string;

import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/3 9:36 下午
 * @Description:
 *          键盘录入一个字符串，把该字符串的首字母转换成大写，其余为小写。(只考虑英文大小写字母字符)
 */
public class StringPractice3 {
    public static void main(String[] args) {
        System.out.print("请输入一串英文字符：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(transString(str));
    }
    public static String transString(String str){
        String str1 = str.substring(0, 1);
        String str2 = str.substring(1);
        String str3 = str1.toUpperCase()+str2.toLowerCase();
        return str3;
    }
}
