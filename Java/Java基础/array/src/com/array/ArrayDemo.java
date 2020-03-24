package com.array;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/24 8:58 下午
 * @Description:
 *
 *      定义类型：
 *          数据类型[] 数组名 //推荐
 *          数据类型 数组名[]
 *
 *      数组初始化：
 *          - 为数组开辟内存空间，并为数组中的每个元素赋予初始值
 *          - 动态初始化 只给出长度，由系统给出初始化值 数据类型[] 数组名 = new 数据类型[数组长度]
 *          - 静态初始化 给出初始化值，由系统决定长度
 *
 *      定义一个数组，输出数组名及元素，然后给数组中的元素赋值，再次输出数组名及元素
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // 定义动态数组
        int[] arr = new int[3];
        // 输出数组名及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // 给数组中的元素赋值
        arr[0] = 100;
        arr[2] = 300;
        // 输出数组名及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 定义静态数组
        int[] arr_static = {1, 2, 3};
        System.out.println(arr_static);
        System.out.println(arr_static[0]);
        System.out.println(arr_static[1]);
        System.out.println(arr_static[2]);
    }
}
