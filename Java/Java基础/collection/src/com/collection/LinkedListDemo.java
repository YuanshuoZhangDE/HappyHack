package com.collection;

import java.util.LinkedList;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/18 8:30 下午
 * @Description:
 *          List的常用子类：
 *              ArrayList
 *                  底层是数组结果，查询快，增删慢
 *              LinkedList
 *                  底层结构是链表，查询慢，增删快
 *
 *              LinkedList的特有功能
 *                  void addFirst(E e)
 *                  void addLast(E e)
 *                  E getFirst()
 *                  E getLast()
 *                  E removeFirst()
 *                  E removeLast()
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList lkl = new LinkedList();
        lkl.add("hello");
        lkl.add("world");
//        void addFirst(E e)
        lkl.addFirst("java");
//        void addLast(E e)
        lkl.addLast("android");
//        E getFirst()
        System.out.println(lkl.getFirst());
//        E getLast()
        System.out.println(lkl.getLast());
//        E removeFirst()
        System.out.println(lkl.removeFirst());
//        E removeLast()
        System.out.println(lkl.removeLast());
        System.out.println(lkl);
    }
}
