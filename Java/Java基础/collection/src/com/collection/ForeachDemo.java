package com.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/18 6:06 下午
 * @Description:
 *          foreach: 增强for循环，一般用于遍历集合或者数组
 */
public class ForeachDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("java");
        //增强for循环遍历集合
        for (String s : c) {
            System.out.println(s.toUpperCase());
        }
    }
}
