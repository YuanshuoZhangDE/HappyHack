package com.string;

import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/3 9:19 下午
 * @Description:
 *      1.遍历字符串
 *      2.统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数
 */
public class StringPractice2 {
    public static void main(String[] args) {
//        String str = "HelloWorld!";
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }
        System.out.print("请输入一段字符：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = 0;
        int A_num = 0;
        int a_num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                A_num += 1;
            }else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                a_num += 1;
            }else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num += 1;
            }
        }
        System.out.println("大写字符："+A_num);
        System.out.println("小写字符："+a_num);
        System.out.println("数字字符："+num);
    }
}
