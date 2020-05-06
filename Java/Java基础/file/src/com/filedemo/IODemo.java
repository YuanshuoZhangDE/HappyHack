package com.filedemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/21 8:22 下午
 * @Description:
 *          IO流分类
 *              流向
 *                  输入流     读取数据    FileReader      Reader
 *                  输出流     写出数据    FileWriter      Writer
 *              数据类型
 *                  字节流
 *                          字节输入流    读取数据   InputStream
 *                          字节输出流    写出数据   OutputStream
 *                  字符流
 *                          字符输入流    读取数据   Reader
 *                          字符输出流    写出数据   Writer
 */
public class IODemo {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
        FileReader fr = new FileReader("src/com/filedemo/a.txt");
        //创建字符输出流对象
        FileWriter fw1 = new FileWriter("src/com/filedemo/Copy-a.1");
        FileWriter fw2 = new FileWriter("src/com/filedemo/Copy-a.2");

        //一次读写一个字符
        int ch;
        while ((ch = fr.read()) != -1) {
            fw1.write(ch);
            fw1.flush();
        }
        //一次读写一个字符数组
        int len;//用于存储读到的字符个数
        char[] chs = new char[1024];
        while ((len= fr.read(chs)) != -1) {
            fw2.write(chs, 0, len);
            fw2.flush();
        }
        //释放资源
        fw1.close();
        fw2.close();
        fr.close();
    }
}
