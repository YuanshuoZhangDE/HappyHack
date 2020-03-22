package com.java;

import com.sun.tools.classfile.ConstantPool;

import java.util.Scanner;

/*
键盘录入学生成绩，请根据成绩判断该学生属于哪个级别
    - 90-100 优秀
    - 80-90 好
    - 70-80 良
    - 60-70 及格
    - 60以下不及格
 */
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数据：");
        int num = sc.nextInt();
        if (num >= 90 && num <= 100) {
            System.out.println("优秀");
        }else if (num >= 80 && num < 90) {
            System.out.println("好");
        }else if (num >= 70 && num < 80) {
            System.out.println("好");
        }else if (num >= 60 && num < 70) {
            System.out.println("好");
        }else {
            System.out.println("不及格");
        }
    }
}
