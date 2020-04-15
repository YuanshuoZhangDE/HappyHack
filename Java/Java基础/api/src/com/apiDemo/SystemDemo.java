package com.apiDemo;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/15 9:35 下午
 * @Description:
 *      System:包含一些有用的类字段和方法。他不能被实例化
 *      static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 *      static long currentTimeMillis()
 *      static void exit(int status)
 */
public class SystemDemo {
    public static void main(String[] args) {
        //arrayCopy();
        //currentTimeMillis();
        //exit();
    }

    private static void exit() {
        //static void exit(int status):终止虚拟机
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            if (i == 100) {
                System.exit(0);
            }
        }
    }

    private static void currentTimeMillis() {
        //static long currentTimeMillis():以毫秒返回当前的系统时间
        System.out.println(System.currentTimeMillis());
    }

    private static void arrayCopy() {
        //        static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
//        复制数组
//        参数1：源数组
//        参数2：源数组的起始位置
//        参数3：目标数组
//        参数4：目标数组的起始索引位置
//        参数5：指定接受的元素个数
        int[] src = {1, 2, 4, 5, 6};
        int[] dest = new int[5];
        System.arraycopy(src, 0, dest, 0, 5);
        for (int i = 0; i < 5; i++) {
            System.out.print(dest[i]);
        }
    }
}
