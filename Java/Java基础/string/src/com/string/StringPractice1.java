package com.string;

import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/3 5:03 下午
 * @Description:
 *          模拟登录，给三次机会，并提示还有几次
 *
 *          分析：
 *              定义两个字符串对象，用于存储已经存在的用户名和密码
 *              键盘录入用户名和密码
 *              用键盘录入的用户名和密码与已经存在的用户名和密码进行比较
 *                  如果内容相同，登录成功
 *                  如果内容不同，登录失败，并提示还有几次机会
 */
public class StringPractice1 {
    public static void main(String[] args) {
        int num = 3;

        String us = getUsername();
        String ps = getPaswd();

        bool(num, us, ps);





    }
    public static String getUsername(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String usrname = sc.nextLine();
        return usrname;
    }
    public static String getPaswd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入密码：");
        String paswd = sc.nextLine();
        return paswd;
    }
    public static void bool(int num, String us, String ps){
        if (num > 0) {
            System.out.print("请输入登录用户名：");
            Scanner sc = new Scanner(System.in);
            String usrname = sc.nextLine();
            if (usrname.equals(us)) {
                System.out.print("请输入登录密码：");
                String paswd = sc.nextLine();
                if (paswd.equals(ps)) {
                    System.out.println("登录成功");
                }else{
                    num -= 1;
                    System.out.println("还有"+num+"次登录机会");
                    bool(num,us,ps);
                }
            }else {
                System.out.println("用户名错误。");
                num -=1;
                System.out.println("还有"+num+"次登录机会");
                bool(num,us,ps);
            }
        }else {
            System.out.println("没机会了");
        }
    }

}
