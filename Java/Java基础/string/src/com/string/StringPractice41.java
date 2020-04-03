package com.string;

import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/3 10:00 下午
 * @Description:
 *          字符串反转
 *          举例：键盘录入"abc"
 *          输出结果："cba"
 */
public class StringPractice41 {
    public static void main(String[] args) {
        System.out.print("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        for (int i = str1.length()-1; i >= 0 ; i--) {
            System.out.print(str1.charAt(i));
        }
    }
}
