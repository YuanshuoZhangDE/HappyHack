package com.object2;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/1 8:55 下午
 * @Description:
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Yuanshuo");
        s.setAge(22);
        System.out.println(s.getName() + ":" + s.getAge());
    }
}
