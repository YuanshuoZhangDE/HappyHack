package com;

/**
 * @Author: Yuanshuo
 * @Date: 2020/5/24 9:34 下午
 * @Description:
 */
public class TicketThread implements Runnable{
    int tickets = 100;//火车票数
    Object obj = new Object();
    @Override
    public void run() {
        //出售火车票
        while (true) {
            synchronized (obj){
                //当火车票不为0时，则售票
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+":"+tickets--);
                }else{
                    System.out.println(Thread.currentThread().getName()+":"+"车票已售完");
                }
            }
        }
    }
}
