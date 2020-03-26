package com.basicgrammarpractice;

import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/26 5:18 下午
 * @Description:
 *      需求：
 *      - 键盘录入5个int类型的数据存储数组arr中
 *      - 定义方法将arr数据反转
 *      - 定义方法对反转后的数组进行遍历
 */
public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要存放的数字个数：");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("请输入第"+(i+1)+"个数字：");
            arr[i] = sc.nextInt();
        }
        reverse(arr);
    }

    public static void reverse(int[]arr){
        for (int i = 0; i < arr.length/2; i++) {
            int a = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
    }
}
