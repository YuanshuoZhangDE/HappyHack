package com.object3;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/1 9:04 下午
 * @Description:
 *          构造方法：
 *              给对象数据进行初始化
 *          格式：
 *              方法名和类名相同
 *              没有返回值类型，连void都不能写
 *              没有具体的返回值
 */
public class Student {
    private int age;
    private String name;

    public Student(){

    }

    public Student(String name){
        this.name = name;
    }

    public Student(int age){
        this.age = age;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name+":"+age);
    }
}
