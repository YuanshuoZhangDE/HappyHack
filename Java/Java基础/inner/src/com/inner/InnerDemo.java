package com.inner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/11 10:16 上午
 * @Description:
 *      成员内部类：
 *          在类的成员位置，和成员变量，以及成员方法所在的位置一样
 *          在内部类当中，可以直接访问外部类的成员，包括私有成员
 *
 *      成员内部类的修饰符：
 *          我们可以使用权限修饰符修饰成员内部类，但是如果使用私有来修饰，则无法在其他类中访问
 *          我们可以使用static修饰成员内部类，不用再创建外部类的对象了
 */
public class InnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();

        Outer.Inner oi = new Outer().new Inner();
        oi.function();
    }
}

class Outer {
    private int num = 10;
    public void method(){
        Inner inner = new Inner();
        inner.function();
    }
    class Inner {
        public void function(){
            System.out.println("function");
            System.out.println(num);
        }
    }
}

