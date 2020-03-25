package com.method;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/25 8:17 下午
 * @Description:
 */
public class MethodDemo {
    public static void main(String[] args) {
        int d = sum(2,5);
        System.out.println(d);
    }

    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }
}
