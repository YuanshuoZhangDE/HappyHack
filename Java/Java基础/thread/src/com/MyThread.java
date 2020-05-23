package com;

/**
 * @Author: Yuanshuo
 * @Date: 2020/5/23 7:37 下午
 * @Description:
 *      多线程
 *      进程：当前正在运行的程序，一个应用程序在内存中的执行区域
 *      线程：进程中的一个执行控制单元，执行路径
 *
 *      一个进程可以有一个线程，也可以有多个线程
 *
 *      单线程：安全性高，效率低
 *      多线程：安全性低，效率高
 *
 *      多线程的实现方式：
 *          方式一：将类声明为Thread的子类。该子类应重写Thread类的run方法。接下来可以分配并启动该子类的示例。
 *          方式二：创建线程的另一种方法是声明实现Runnable接口的类。该类然后实现run方法。然后可以分配该类的实例，在创建Thread时作为一个参数来传递并启动。
 *
 *      CPU执行程序的随机性
 */
public class MyThread {
    public static void main(String[] args) {
        //创建线程实例
        ThreadDemo td1 = new ThreadDemo();
        //修改线程名字
        td1.setName("张三");
        //启动线程
        td1.start();

        //创建线程实例
        ThreadDemo td12 = new ThreadDemo();
        //修改线程名字
        td12.setName("李四");
        //启动线程
        td12.start();

        //创建线程实例
        ThreadDemo2 td2 = new ThreadDemo2();
        Thread t = new Thread(td2);
        //修改线程名字
        t.setName("麻五");
        //启动线程
        t.start();
    }
}
