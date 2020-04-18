package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/18 5:53 下午
 * @Description:
 *      使用集合存储自定义对象并遍历
 *      由于集合可以存储任意类型的对象，当我们存储不同类型的对象，就有可能在转换的时候出现类型转换异常，
 *      所以Java为了解决这个问题，Java提供一种机制，泛型
 *
 *      泛型：
 *          是一种广泛的类型，把明确数据类型的工作提前到了编译的时期，借鉴了数组的特点
 *          好处：
 *              避免了类型转换的问题
 *              简化代码的书写
 *
 */
public class GenericDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection<Student> c = new ArrayList<Student>();
        //创建元素对象
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);
        //添加元素对象
        c.add(s1);
        c.add(s2);
        //遍历集合对象
        Iterator<Student> it = c.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.name);
            System.out.println(s.age);
        }
    }
}

class Student{
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
