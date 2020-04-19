package com.mapAndSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/19 10:39 上午
 * @Description:
 *          使用HashSet存储自定义对象并遍历
 */
public class HashSetDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        Set<Student> set= new HashSet<Student>();
        //创建元素对象
        Student s1 = new Student("ZhangSan", 18);
        Student s2 = new Student("LiSi", 19);
        Student s3 = new Student("LiSi", 19);
        //添加元素对象
        set.add(s1);
        set.add(s2);
        set.add(s3);
        //遍历集合对象
        Object[] obj = set.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
        //增强for
        for (Student s:set
             ) {
            System.out.println(s);
        }
    }
}

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //去重
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}