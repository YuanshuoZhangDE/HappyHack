package com.java;
/*
实现数据录入：JDK提供的类Scanner
使用步骤：
1. 导包
    import java.util.Scanner
2. 创建键盘录入对象
    Scanner sc = new Scanner(System.in)
3. 接收数据
    int i = sc.nextInt()
 */
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //接收数据
        System.out.println("请输入一个整型：");
        int i = sc.nextInt();
        //输出结果
        System.out.println("i:"+i);

    }

}
