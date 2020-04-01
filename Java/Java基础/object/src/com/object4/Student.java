package com.object4;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/1 9:16 下午
 * @Description:
 */
public class Student {
    //成员变量
    private String name;
    private int age;

    //构造方法
    public Student(){}
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //成员方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
