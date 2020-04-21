package com.filedemo;

import java.io.*;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/21 8:55 下午
 * @Description:
 */
public class IODemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/yuanshuozhang/Desktop/我们的留学生活-在日本的日子/08.小留学生（下）.rmvb");
        FileOutputStream fos = new FileOutputStream("copy.rmvb");
        //一次读取一个字节数组的方式
        int len;
        byte[] bys = new byte[1024];
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        fos.close();
        fis.close();
    }
}
