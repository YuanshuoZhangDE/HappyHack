package com.io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/22 5:13 下午
 * @Description:
 *      打印流：
 *          PrintStream
 *          PrintWriter
 *
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建打印流对象
        //PrintWriter pw = new PrintWriter("PrintWriterDemo.txt");
        PrintWriter pw = new PrintWriter(new FileWriter("PrintWriterDemoAutoFlush.txt"), true);//自动刷新，只有println,format有效，及可不加close
        //写入数据
        pw.write("hello");
        pw.write("world");
        pw.write("java");
        //自动换行
        pw.println("hello");
        pw.println("world");
        pw.println("java");

        //释放资源
        pw.close();
    }
}
