package com.array;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/24 11:53 下午
 * @Description:
 *
 *      数组遍历(依次输出数组中的每个元素)
 *          - 获取数值长度：数值名.length
 *
 *      数组获取最值
 */
public class ArrayPractice2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7};
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.println("arr["+i+"]:"+arr[i]);
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println("max:"+max);
    }
}
