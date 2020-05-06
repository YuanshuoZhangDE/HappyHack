package com.filedemo;

import java.io.File;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/21 7:42 下午
 * @Description:
 *      需求：输出指定目录下所有的Java文件名（包含子目录）
 */
public class FileTest {
    public static void main(String[] args) {
        File f = new File("src");
        method(f);
    }

    //输出指定目录下的所有Java文件名（不包含子目录）
    public static void method(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files
            ) {
                //判断是否是文件对象
                if (f.isFile()) {
                    if (f.getName().endsWith(".java")) {
                        System.out.println(f.getName());
                    }
                }else {
                    //是一个目录对象
                    method(f);
                }
            }
        }
    }


    //输出指定目录下的所有Java文件名（不包含子目录）
    public static void method2 (File file){
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files
            ) {
                //判断是否是文件对象
                if (f.isFile()) {
                    if (f.getName().endsWith(".java")) {
                        System.out.println(f.getName());
                    }
                }
            }
        }
    }
}