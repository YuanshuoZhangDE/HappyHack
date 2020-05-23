package com;

/**
 * @Author: Yuanshuo
 * @Date: 2020/5/23 8:01 下午
 * @Description:
 */
public class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":"+i);
        }
    }
}
