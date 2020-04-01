package com.object4;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/1 9:17 下午
 * @Description:
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Yuanshuo");
        s.setAge(22);
        System.out.println(s.getName()+":"+s.getAge());

        Student a = new Student("Yuanshuo", 22);
        System.out.println(s.getName()+":"+s.getAge());
    }
}
