package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/6 6:37 下午
 * @Description:
 */
public class FileReaderDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("IoDemo2.txt");
    }
}
