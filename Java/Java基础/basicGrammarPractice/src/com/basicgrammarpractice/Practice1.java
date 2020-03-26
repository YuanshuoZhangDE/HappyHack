package com.basicgrammarpractice;

import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/26 3:12 下午
 * @Description:
 *          需求：键盘录入一个月份，输出该月份对应的季节
 *              3，4，5 春
 *              6，7，8 夏
 *              9，10，11 秋
 *              12，1，2 冬
 */
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        season_if(month);
        season_switch(month);
    }
    public static void season_if(int month){
        if (month == 3 || month == 4 || month == 5) {
            System.out.println("春季");
        }else if (month == 6 || month == 7 || month == 8) {
            System.out.println("夏季");
        }else if (month == 9 || month == 10 || month == 11) {
            System.out.println("秋季");
        }else {
            System.out.println("冬季");
        }
    }
    public static void season_switch(int month){
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("请输入正确月份");
                break;
        }
    }
}
