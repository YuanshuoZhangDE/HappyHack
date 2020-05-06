package com.mapAndSet;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/19 4:17 下午
 * @Description:
 *      模拟斗地主发牌
 */
public class CollectionsTest {
    public static void main(String[] args) {
        String[] arr = {"黑桃", "红桃", "方片", "梅花"};
        String[] arr2 = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        ArrayList<String> box = new ArrayList<String>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                box.add(arr[i]+arr2[j]);
            }
        }
        box.add("小王");
        box.add("大王");
        System.out.println(box);
        System.out.println("洗牌");
        Collections.shuffle(box);
        System.out.println(box);
        ArrayList<String> ZhangSan = new ArrayList<String>();
        ArrayList<String> LiSi = new ArrayList<String>();
        ArrayList<String> WangWu = new ArrayList<String>();

        //留三张底牌给地主
        for (int i = 0; i < box.size()-3; i++) {
            if (i % 3 == 0) {
                ZhangSan.add(box.get(i));
            } else if (i % 3 == 1) {
                LiSi.add(box.get(i));
            } else if (i % 3 == 2) {
                WangWu.add(box.get(i));
            }
        }
        System.out.println("张三");
        System.out.println(ZhangSan);
        System.out.println("李四");
        System.out.println(LiSi);
        System.out.println("王五");
        System.out.println(WangWu);

        System.out.println("底牌");
        System.out.println(box.get(box.size()-1));
        System.out.println(box.get(box.size()-2));
        System.out.println(box.get(box.size()-3));
    }
}
