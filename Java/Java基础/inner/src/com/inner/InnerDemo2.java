package com.inner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/11 10:33 上午
 * @Description:
 *      局部内部类：
 *
 */
public class InnerDemo2 {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.method();
    }
}

class Outer2 {
    public void method(){
        class Inner{
            public void function(){
                System.out.println("function");
            }
        }

        Inner i = new Inner();
        i.function();
    }
}


