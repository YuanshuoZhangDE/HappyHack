package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/6 6:37 下午
 * @Description:
 */
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileReader fr = new FileReader("IoDemo2.txt");
        //调用输入流对象的读数据方法
        //int read()：一次读取一个字符
        int ch = fr.read();
        System.out.println(ch);
        System.out.println((char)ch);
        //循环遍历
        int chr;
        while ((chr=fr.read()) != -1){
            System.out.print((char)chr);
        }
        //释放资源
        fr.close();
    }
}
