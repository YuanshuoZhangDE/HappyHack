package com.apiDemo;

import java.util.Objects;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/15 9:03 下午
 * @Description:
 *          String toString()
 *          boolean equals(Object obj)
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 18;
        s.name = "Zhang";
        System.out.println(s.toString());//com.apiDemo.Student@61bbe9ba
        System.out.println(s);//com.apiDemo.Student@61bbe9ba,说明输出一个对象默认输出这个对象的toString()方法

        Student s2 = new Student();
        s2.name = "Zhang";
        s2.age = 18;
        boolean flag = s.equals(s2);
        System.out.println(flag);
    }
}

class Student extends Object{
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}