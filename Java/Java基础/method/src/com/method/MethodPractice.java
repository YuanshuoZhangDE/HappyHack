package com.method;

import javax.swing.*;
import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/25 8:52 下午
 * @Description:
 *          - 键盘录入两个数据，返回两个数中较大的值
 *          - 键盘录入两个数据，比较两个数是否相等
 *          - 键盘录入三个数据，返回三个数中的最大值
 */
public class MethodPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();
        max_2(a, b);
        System.out.println("请输入第三个数据：");
        int c = sc.nextInt();
        max_3(a, b, c);
    }

    //比较两个数的大小
    public static int max_2(int a, int b) {
        if (a > b) {
            System.out.println("a>b:" + a);
            return a;
        } else if (a < b) {
            System.out.println("a<b:" + b);
            return a;
        } else {
            System.out.println("a=b");
            return 0;
        }
    }

    //比较三个数返回最大值
    public static int max_3(int a, int b, int c) {
        if (a >= b) {
            if (a >= c) {
                System.out.println("max : a " + a);
                return a;
            } else {
                System.out.println("max : c " + c);
                return c;
            }
        } else {
            if (b >= c) {
                System.out.println("max : b " + b);
                return b;
            } else {
                System.out.println("max : c " + c);
                return c;
            }
        }

    }
}