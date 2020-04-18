package com.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/18 8:21 下午
 * @Description:
 *          List:
 *              有序的（存储和读取的顺序是一致的）
 *              有整数索引
 *              允许重复的
 *
 *          List的特有功能
 *              void add(int index, E element)
 *              E get(int index)
 *              E remove(int index)
 *              E set(int index, E element)
 *
 *          增删改查
 */
public class ListDemo {
    public static void main(String[] args) {
        //创建列表对象
        List ls = new ArrayList();

        //void add(int index, E element)
        ls.add(0, "hello");
        ls.add(0, "world");
        ls.add(1, "java");
        System.out.println(ls);
        //E get(int index)
        System.out.println(ls.get(1));
        //remove(int index):删除指定元素并返回
        System.out.println(ls.remove(0));
        System.out.println(ls);
        //E set(int index, E element)
        System.out.println(ls.set(0, "android"));
        System.out.println(ls);


    }
}
