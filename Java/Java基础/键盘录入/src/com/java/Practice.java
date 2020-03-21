package com.java;
import java.util.Scanner;
//键盘录入数据练习
//- 键盘录入两个数据，并对两个数据求和，输出其结果
//- 键盘录入两个数据，并比较两个数据是否相等
//- 键盘录入三个数据，获取这三个数据中的最大值
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();

        //求和
        int sum = a + b;
        System.out.println("两数和为"+sum);

        // 比较两数据是否相等
        boolean bool = (a == b);
        System.out.println("两数据是否相等：" + bool);

        System.out.println("请输入第三个数据：");
        int c = sc.nextInt();
        // 获取三个数的最大值
        // 先获取两个数据的最大值，然后和第三个数据进行比较
        int temp = (a>b)?a:b;
        int max = (c>temp)?c:temp;
        System.out.println("三个数据的最大值为：" + max);


    }
}
