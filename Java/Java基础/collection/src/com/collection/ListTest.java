package com.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/18 8:40 下午
 * @Description:
 *          需求：
 *              定义一个方法，返回指定列表中指定元素的索引位置
 *
 */
public class ListTest {
    public static void main(String[] args) {
        List ls = new ArrayList();
        ls.add("hello");
        ls.add("world");
        ls.add("java");
        int index = index(ls, "hello");
        System.out.println(index);
    }

    public static int index(List ls, Object other){
        for (int i = 0; i < ls.size(); i++) {
            //获取列表中指定元素
            Object obj = ls.get(i);
            //使用列表中的元素和指定元素进行比较
            if (obj.equals(other)) {
                return i;
            }
        }
        //查找不到指定元素
        return -1;
    }
}
