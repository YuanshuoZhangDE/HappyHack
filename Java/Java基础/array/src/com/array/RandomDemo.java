package com.array;

import java.util.Random;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/24 8:37 下午
 * @Description:
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(10); //含左不含右 [0, 10)
            System.out.println(number);
        }
        // 若是输出1-100之间的随机数
        //int i = r.nextInt(100); //[0, 99]
        int i = r.nextInt(100) + 1; // [1, 100]
        System.out.println(i);
    }
}
