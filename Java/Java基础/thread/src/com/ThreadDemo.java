package com;

/**
 * @Author: Yuanshuo
 * @Date: 2020/5/23 7:46 下午
 * @Description:
 */
public class ThreadDemo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" +i);
        }
    }
}
