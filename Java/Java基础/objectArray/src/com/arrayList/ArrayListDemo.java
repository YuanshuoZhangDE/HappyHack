package com.arrayList;

import java.util.ArrayList;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/4 8:14 下午
 * @Description:
 *          ArrayList<E>
 *              大小可变数组的实现
 *
 *              <E>: 是一种特殊的数据类型，泛型
 *              使用：
 *                  再出现E的地方使用引用数据类型替换即可
 *              举例：
 *                  ArrayList<String>,ArrayList<Student>
 *              构造方法：
 *                  ArrayList()
 *              添加元素：
 *                  public boolean add(E e):
 *                  public void add(int index, E element):
 *              获取元素：
 *                  public E get(int index): 返回指定索引处的元素
 *              集合长度：
 *                  public int size():
 *              删除元素：
 *                  public boolean remove(Object o): 删除指定的元素，返回删除是否成功
 *                  public E remove(int index): 删除指定索引处的元素，返回被删除的元素
 *              修改元素：
 *                  public E set(int index, E element): 修改指定索引处的元素，返回被修改的元素
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        //添加元素
        array.add("hello");
        array.add("world");
        array.add(1,"java");
        //获取元素
        System.out.println(array.get(0));
        //集合长度
        System.out.println(array.size());
        //删除元素
        System.out.println(array.remove("hello"));
        System.out.println(array.remove(0));
        //修改元素
        System.out.println(array.set(0, "set"));
    }
}
