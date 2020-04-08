package com.staticdemo;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/8 11:40 上午
 * @Description:
 *          static: 是一个关键字，用于修饰成员变量和成员方法
 *          static特点：
 *              被所有对象所共享
 *              可以使用类名调用
 *              对象的加载优先于对象
 *              随着类的加载而加载
 */
public class StaticDemo {
    public static void main(String[] args) {
        Student.school = "QDU";
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setName("111");
        s2.setName("222");
        System.out.println(s1.getName()+s1.school);

    }
}

class Student{
    static String school;
    String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}