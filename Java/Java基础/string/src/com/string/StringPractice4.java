package com.string;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/3 9:52 下午
 * @Description:
 *          把数组中的数据按照指定格式拼接成一个字符串
 *          举例：int[] arr = {1,2,3}
 *          输出结果：[1, 2, 3]
 */
public class StringPractice4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = arrayTOString(arr);
        System.out.println(s);
    }
    public static String arrayTOString(int[] arr){
        String str = "";

        str += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                str += arr[i];
            }else {
                str += arr[i];
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
}
