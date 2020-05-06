package com;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/20 9:35 下午
 * @Description:
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            System.out.println(2/0);
        }catch (ArithmeticException ae){
            System.out.println("除数不能为零");
        }
    }
}
