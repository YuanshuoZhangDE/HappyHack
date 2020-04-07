package com.io;

import java.io.*;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/7 9:31 下午
 * @Description:
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("IoDemo2.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("CopyBw.txt"));
        int chr;
        while ((chr=br.read())!=-1){
            bw.write((char)chr);
        }
        bw.close();
        br.close();
    }
}
