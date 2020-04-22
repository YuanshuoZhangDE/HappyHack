package com.io;

import java.io.*;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/22 5:30 下午
 * @Description:
 *      使用打印流复制文本文件
 */
public class PrintWriterDemo2 {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        BufferedReader br = new BufferedReader(new FileReader("src//com//io//CopyFileDemo.java"));
        //创建输出流对象
        PrintWriter pw = new PrintWriter("CopyCopyFileDemo.txt");
        //写入资源
        String line;
        while ((line=br.readLine()) != null) {
            pw.println(line);
        }
        //释放资源
        pw.close();
        br.close();
    }
}
