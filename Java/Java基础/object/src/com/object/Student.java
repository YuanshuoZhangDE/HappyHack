package com.object;

/**
 * @Author: Yuanshuo
 * @Date: 2020/3/31 10:51 下午
 * @Description:
 *          需求：写一个学生类
 *
 *          学生事务：
 *              属性：姓名，年龄...
 *              行为：学习，吃饭...
 *
 *          学生类：
 *              成员变量：姓名，年龄...
 *              成员方法：学习，吃饭...
 */
public class Student {
    String name;
    int age;

    public void study(){
        System.out.println("学习");
    }
    public void eat(){
        System.out.println("吃饭");
    }
}
