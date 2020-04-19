package com.mapAndSet;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/19 5:31 下午
 * @Description:
 *          需求：实现学号和姓名这样有对应关系的数据存储
 *
 *
 */
public class MapDemo {
    public static void main(String[] args) {
        //创建Map对象
        Map<String, String> map = new HashMap<String, String>();
        map.put("001", "张三");
        System.out.println(map);

        System.out.println(map.containsKey("001"));

        map.remove("001");

        map.clear();
    }
}
