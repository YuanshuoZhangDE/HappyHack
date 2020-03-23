package com.java;

import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/23 3:28 下午
 * @Description:
 *          根据键盘录入的数值1，2，3，...，7输出对应的星期一，星期二.....
 */
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            default:
                System.out.println("请输入有效数据");
                break;
        }
    }
}
