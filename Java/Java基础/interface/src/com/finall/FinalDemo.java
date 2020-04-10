package com.finall;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/10 8:30 下午
 * @Description:
 *          final：修饰符，可以用于修饰类、成员方法和成员变量
 *          final修饰的类：不能被继承，不能有子类
 *          final修饰的方法：不能被子类重写
 *          final修饰的变量：是不可以修改的，是常量
 */
public class FinalDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
    }
}

final class Animal {
    public void eat(){
        System.out.println("吃东西");
    }
}
