package com.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/6 6:16 下午
 * @Description:
 *      FileWriter写数据的方法：
 *          void write(String str)：写一个字符串数据
 *          void write(String str, int index, int len)：写一个字符串中的一部分数据
 *          void write(int ch)：写一个字符数据，这里写int 类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a',97
 *          void write(char[] chs)：写一个字符数组数据
 *          void write(char[]chs, int index, int len)：写一个字符数组的一部分数据
 *      数据的追加写入：
 *          FileWriter fw = new FileWriter("路径", true); 表示追加写入，默认是false
 */
public class FileWriterDemo2 {
    public static void main(String[] args) throws IOException {
        //创建输出流对象
        FileWriter fw = new FileWriter("IoDemo2.txt");

        //void write(String str)：写一个字符串数据
        fw.write("abcdefghijklmnopqrstuvwxyz");
        fw.write("\n");
        fw.flush();
        //void write(String str, int index, int len)：写一个字符串中的一部分数据
        fw.write("abcdefghijklmnopqrstuvwxyz", 1, 7);
        fw.write("\n");
        fw.flush();
        //void write(int ch)：写一个字符数据，这里写int 类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a',97
        fw.write(97);
        fw.write('a');
        fw.write("\n");
        fw.flush();
        //void write(char[] chs)：写一个字符数组数据
        char[] chs = {'b', 'b', 'b', 'b'};
        fw.write(chs);
        fw.write("\n");
        fw.flush();
        //void write(char[]chs, int index, int len)：写一个字符数组的一部分数据
        fw.write(chs, 1, 3);
        fw.write("\n");
        fw.close();

    }
}
