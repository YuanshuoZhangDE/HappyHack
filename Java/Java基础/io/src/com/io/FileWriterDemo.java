package com.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/6 5:45 下午
 * @Description:
 *      close():先刷新缓冲区，再释放资源。流对象不可以在被使用。
 *      flush():刷新缓冲区。流对象可以继续使用。
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("IoDemo.txt");//相对于当前的项目
        //写一个字符串数据
        fw.write("HelloWorld!");
        //数据没有直接写到文件，其实是写到了内存缓冲区，flush刷新
        fw.flush();
        //释放资源
        fw.close();
    }
}
