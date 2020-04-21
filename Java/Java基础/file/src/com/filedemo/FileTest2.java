package com.filedemo;

import java.io.File;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/21 8:04 下午
 * @Description:
 *      需求：删除指定的目录（包含子目录）
 */
public class FileTest2 {
    public static void main(String[] args) {
        File f = new File("/Users/yuanshuozhang/Desktop/YuanshuoRepositories/HappyHack/Java/Java基础/file/src/com/filedemo/b");
        method(f);
    }

    public static void method(File file){
        if (file.isDirectory()) {
            //干掉自己所有的子目录和子文件
            File[] fiels = file.listFiles();
            for (File f:fiels
                 ) {
                if (f.isFile()) {
                    f.delete();
                }else {
                    method(f);
                }
            }
            //干掉自己
            file.delete();

        }
    }
}
