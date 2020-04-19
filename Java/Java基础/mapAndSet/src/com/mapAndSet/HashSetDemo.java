package com.mapAndSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/19 10:13 上午
 * @Description:
 *          使用HashSet存储字符串并遍历
 *          Set集合的特点：
 *              无序
 *              不允许重复（要求元素唯一）
 *              没有索引
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        //HashSet<String> hs = new HashSet<String>();
        Set<String> set = new HashSet<String>();//父接口引用指向子类对象

        //添加元素对象
        set.add("hello");
        set.add("world");
        set.add("java");

        //遍历集合对象
        //转数组
        Object[] objs= set.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.println(objs[i]);
        }
        //迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        //增强for
        for (String s:set
             ) {
            System.out.println(s);
        }
    }
}
