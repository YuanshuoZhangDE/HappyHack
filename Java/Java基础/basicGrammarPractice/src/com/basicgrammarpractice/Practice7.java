package com.basicgrammarpractice;

import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/26 5:49 下午
 * @Description:
 *          需求：数字元素查找(查找指定元素第一次在数组中出现的索引)
 *          - {5, 7, 3, 2, 5}
 *          - 要查询的元素通过键盘录入的方式确实能够
 *          - 定义一个查找数组元素第一次出现位置的方法
 */
public class Practice7 {
    public static void main(String[] args) {
    search();
    }
    public static void search(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要查找的数字：");
        int num = sc.nextInt();
        int[] arr = {5, 7, 3, 2, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("index:"+i);
                break;
            }else if (i == arr.length-1 ) {
                System.out.println("数组内没有要查询的数据。");
                search();
            }
        }
    }

}
