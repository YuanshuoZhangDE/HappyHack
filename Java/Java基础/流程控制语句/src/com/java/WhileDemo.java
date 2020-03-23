package com.java;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/23 4:09 下午
 * @Description:
 *          - 在控制台输出10次HelloWord
 *          - 求1-100之和
 *          - 统计水仙花数的个数
 */
public class WhileDemo {
    public static void main(String[] args) {
        /*
        // 在控制台输出10次HelloWord
        int i = 1;
        while (i <= 10){
            System.out.println("HelloWorld");
            i += 1;
        }
         */

        /*
        //求1-100之和
        int i = 1;
        int sum = 0;
        while (i <= 100){
            sum += i;
            i += 1;
        }
        System.out.println(sum);
         */

        // 统计水仙花数的个数
        int i = 100;
        int num = 0;
        while (i <= 999){
            int sum_1 = i%10;
            int sum_10 = i/10%10;
            int sum_100 = i/10/10%10;
            int result = sum_1*sum_1*sum_1 + sum_10*sum_10*sum_10 + sum_100*sum_100*sum_100;
            if (result == i) {
                num += 1;
                System.out.println("水仙花数：" + i);
            }
            i += 1;
        }
        System.out.println("水仙花数的个数：" + num);

    }
}
