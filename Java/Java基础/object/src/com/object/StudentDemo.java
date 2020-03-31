package com.object;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/31 10:57 下午
 * @Description:
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student Xiaoming = new Student();
        Xiaoming.age = 12;
        Xiaoming.name = "Xiaoming";
        System.out.println(Xiaoming.age);
        System.out.println(Xiaoming.name);

        Xiaoming.study();
        Xiaoming.eat();
    }
}
