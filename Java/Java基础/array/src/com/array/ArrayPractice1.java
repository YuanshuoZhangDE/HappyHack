package com.array;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/24 9:31 下午
 * @Description:
 *          定义两个数组，分别输出数组名及元素，然后分别给数组中的元素赋值，分别再次输出数组名及元素
 */
public class ArrayPractice1 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        // 输出数组名及元素
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        // 赋值
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        // 输出数组名及元素
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        // 定义第三个数组的时候，把第一个数组的地址赋值给第三个数组
        int[] arr3 = arr1;
        System.out.println(arr3);
    }
}
