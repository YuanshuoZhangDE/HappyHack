package com.mapAndSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/19 3:52 下午
 * @Description:
 *          Collections:
 *          面试题：Collection和Collections有什么区别？
 *          Collection是集合体系的最顶层，包含了集合体系的共性
 *          Collections是一个工具类，方法都是用于操作Collection
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        //static int binarySearch(List list, T key) 使用二分查找法查找指定元素在指定列表的索引位置
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        int index = Collections.binarySearch(ls, 4);
        System.out.println(index);
        //static void copy(List list, Object key):是把原列表中的数据覆盖到目标列表
        List<Integer> dest = new ArrayList<Integer>();
        dest.add(9);
        dest.add(9);
        dest.add(9);
        dest.add(9);
        dest.add(9);
        Collections.copy(dest, ls);
        System.out.println(dest);
        //static void fill(List list, Object obj) 使用指定的对象填充指定列表的所有元素
        Collections.fill(dest, 7);
        System.out.println(dest);
        //static void reverse(List list) 反转
        Collections.reverse(ls);
        System.out.println(ls);
        //static void shuffle(List list) 傻否：随机置换
        Collections.shuffle(ls);
        System.out.println(ls);
        //static void sort(List list) 排序 按照列表中的自然顺序进行排序
        Collections.sort(ls);
        System.out.println(ls);
        //static void swap(List list, int i, int j) 将指定列表中的两个索引进行位置互换
        Collections.swap(ls, 0, 1);
        System.out.println(ls);


    }
}
