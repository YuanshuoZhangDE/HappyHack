package com.java;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/23 3:39 下午
 * @Description:
 *          - 在控制台输出10次HelloWord
 *          - 获取数据1-5和5-1
 *          - 求出1-100之间偶数和
 *          - 在控制台输出所有"水仙花数"
 *          - 统计"水仙花数"共有多少个
 *              - 所谓水仙花数是指一个三位数，其各位数字的立方和等于该数本身
 *              - 举例：153就是一个水仙花数
 *              - 153 = 1*1*1 + 5*5*5 + 3*3*3
 */
public class ForDemo {
    public static void main(String[] args) {
        /*
        // 10次HelloWord
        for (int x = 1; x <= 10 ; x++) {
            System.out.println("HelloWord");
        }
        */

        /*
        // 获取1-5
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i);
        }
         */

        /*
        // 求出1-100之间的偶数和
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i%2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
         */


        // 在控制台输出所有"水仙花数" 并 统计个数
        // 获取一个三位数的个、十、百位
        //      举例：153
        //      个位：153%10
        //      十位：153/10%10
        //      百位：153/10/10%10
        int i = 0;
        for (int sum = 100; sum <= 999 ; sum++) {
            int sum_1 = sum % 10;
            int sum_10 = sum/10%10;
            int sum_100 = sum/10/10%10;
            int result = sum_1*sum_1*sum_1 + sum_10*sum_10*sum_10 + sum_100*sum_100*sum_100;
            if (result == sum) {
                System.out.println(sum);
                i += 1;
            }
        }
        System.out.println("三位数中，\"水仙花数\"的个数：" + i);
    }
}
