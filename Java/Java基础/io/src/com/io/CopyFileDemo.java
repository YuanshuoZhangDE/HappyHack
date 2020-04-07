package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/7 8:54 下午
 * @Description:
 *      将FileReaderDemo.java 复制到Copy.java
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("IoDemo2.txt");
        FileWriter fw = new FileWriter("Copy.txt");
        int chr;
        while ((chr=fr.read()) != -1){
            fw.write(chr);
        }
        fw.close();
        fr.close();
    }
}
