package com.array;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/24 8:43 下午
 * @Description:
 *          猜数字小游戏案例
 *          系统产生一个1-100之间的随机数，请猜出这个数据是多少
 */
public class RandomPractice1 {
    public static void main(String[] args) {
        // 系统随机生成一个[1,100]的随机数
        Random r = new Random();
        int i = r.nextInt(100) + 1;
        //循环
        while(true) {
            // 获取用户输入
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个1-100之间的整数：");
            int input = sc.nextInt();
            // 判断用户输入
            if (input == i) {
                System.out.println("猜对了");
                break;
            } else if (input > i) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }
        }
    }
}
