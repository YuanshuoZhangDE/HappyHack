package com.basicgrammarpractice;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/26 3:33 下午
 * @Description:
 *              需求：打印5位数中所有回文数。
 *                  举例：12321，个位与万位相同，十位与千位相同
 */
public class Practice2 {
    public static void main(String[] args) {
        for (int i = 10000; i < 99999; i++) {
            printnum(i);
        }
    }
    public static void printnum(int num){
        int ge  = num % 10;
        int shi = num / 10 % 10;
        int qian = num / 1000 % 10;
        int wan = num / 10000 % 10;
        if (wan == ge && qian == shi) {
            System.out.println(num);
        }
    }
}
