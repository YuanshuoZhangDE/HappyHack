package com.basicgrammarpractice;

import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/26 4:10 下午
 * @Description:
 *          需求：
 *              有一对兔子，从出生后第三个月起，每个月都生一对兔子，小兔子长到第三个月后，每个月又生一对兔子，
 *              假如兔子都不死，问第二十个月的兔子对数为多少。
 *              1, 1, 2, 3, 5, 8...
 */
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int inputmonth = sc.nextInt();
        System.out.println("第"+inputmonth+"个月兔子的对数是"+rabbit(inputmonth));
    }
    public static int rabbit(int inputmonth){
        int[] arr = new int[inputmonth];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < inputmonth; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[inputmonth-1];
    }
}
