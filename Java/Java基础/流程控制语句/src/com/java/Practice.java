package com.java;

import java.util.Scanner;

/*
键盘录入两个数据，获取这两个数据的较大值
键盘录入学生成绩，请根据成绩判断该学生属于哪个级别
    - 90-100 优秀
    - 80-90 好
    - 70-80 良
    - 60-70 及格
    - 60以下不及格
 */
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int num2 = sc.nextInt();
//
//        if (num1 > num2) {
//            System.out.println("大的数为：" + num1);
//        }else {
//            System.out.println("大的数为：" + num2);
//        }
        int max;
        if (num1 > num2) {
            max = num1;
        }else {
            max = num2;
        }
        System.out.println("大的数是：" + max);
    }
}
