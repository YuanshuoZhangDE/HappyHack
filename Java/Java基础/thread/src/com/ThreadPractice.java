package com;

import sun.security.krb5.internal.Ticket;

/**
 * @Author: Yuanshuo
 * @Date: 2020/5/24 9:30 下午
 * @Description:
 *      模拟火车站售票
 *          分析
 *              首先需要有火车票的总数量，每售出一张则数量减一
 *              当火车票的数量小于1时，停止售票
 *              使用多线程模拟多个窗口进行售票
 *              当火车票全部售完，火车站也一样敞开大门欢迎我们
 *
 *              static void sleep(long millis):让当前线程休眠
 *
 *          问题出现的原因
 *              要有多个线程
 *              要有被多个线程共享的数据
 *              多个线程并发的访问共享的数据
 *
 *          解决办法
 *              加锁
 *
 *          synchronized：同步，可以修饰代码块和方法，被修饰的代码块和方法一旦被某个线程访问，则直接锁住，其他线程将无法访问
 *
 *          同步代码块：
 *              synchronized(锁对象){
 *
 *              }
 *
 *          注意：锁对象需要被所有的线程共享
 */
public class ThreadPractice {
    public static void main(String[] args) {
        //创建线程对象
        TicketThread tt = new TicketThread();

        Thread t = new Thread(tt);
        t.setName("窗口1");
        Thread t2 = new Thread(tt);
        t2.setName("窗口2");
        Thread t3 = new Thread(tt);
        t3.setName("窗口3");
        //启动线程对象
        t.start();
        t2.start();
        t3.start();
    }
}
