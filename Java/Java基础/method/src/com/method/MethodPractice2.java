package com.method;

import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/25 9:13 下午
 * @Description:
 *          - 没有明确返回值的方法定义和调用
 *              - 写一个方法，传递一个整数(大于1)，在控制台打印1到数据的值
 *              - 写一个方法，把所有的水仙花数打印在控制台
 */
public class MethodPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int v = sc.nextInt();
        printOneToValue(v);
    }

    public static void printOneToValue(int v){
        for (int i = 0; i <= v; i++) {
            System.out.println(i);
        }
    }
}
