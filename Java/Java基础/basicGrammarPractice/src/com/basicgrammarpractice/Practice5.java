package com.basicgrammarpractice;

import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/26 4:55 下午
 * @Description:
 *      需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分
 *      选手的最后的分为：去掉一个最高和一个最低分的四个评委的平均值
 */
public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入评委人数：");
        int peoplenum = sc.nextInt();
        int[] arr = new int[peoplenum];
        for (int i = 0; i < peoplenum; i++) {
            System.out.println("请第"+ (i+1) + "个评委打分：");
            arr[i] = sc.nextInt();
        }
        compute(arr);
    }

    public static void compute(int[]arr){
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        sum = sum - max - min;
        int average = sum/(arr.length-2);
        System.out.println("average:"+average);
    }
}
