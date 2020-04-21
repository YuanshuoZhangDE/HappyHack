package com.filedemo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/21 4:38 下午
 * @Description:
 *      File:文件和目录路径名的抽象表示形式，File类的实例是不可变的
 *      构造方法：
 *          File(File parent, String child)
 *          File(String pathname)
 *          File(String parent, String child)
 *
 *      File常用功能：
 *          创建
 *              boolean creatNewFile()
 *              boolean mkdir()
 *              boolean mkdirs()
 *          删除
 *              boolean delete()：删除文件夹，这个文件夹下不能有子文件和子文件夹
 *          获取
 *              File getAbsoluteFile()
 *              String getAbsolutePath()
 *              String getName()
 *              String getParent()
 *              File getParentFile()
 *              String getPath()
 *              long lastModified()
 *              long length()
 *          判断
 *              boolean exists()
 *              boolean isAbsolute()
 *              boolean isDirectory()
 *              boolean isFile()
 *              boolean isHidden()
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        //File(String pathname):将指定的路径名称转换成一个File对象
        File f = new File("//Users//yuanshuozhang//Desktop//YuanshuoRepositories//HappyHack//Java//Java基础//file//src//com//filedemo//a.txt");

        //File(String parent, String child):根据指定的父路径和文件路径创建File对象
        File f2 = new File("//Users//yuanshuozhang//Desktop//YuanshuoRepositories//HappyHack//Java//Java基础//file//src//com//filedemo","b");

        //File(File parent, String child):根据指定的父路径和文件路径创建File对象
        File parent = new File("//Users//yuanshuozhang//Desktop//YuanshuoRepositories//HappyHack//Java//Java基础//file//src//com//filedemo//e//a");
        File f3 = new File(parent, "c");

        //创建功能
        //boolean creatNewFile(): 当指定文件不存在时，创建文件并返回true，否则返回flase
        System.out.println(f.createNewFile());
        //boolean mkdir(): 当指定文件不存在时，创建文件并返回true，否则返回flase
        System.out.println(f2.mkdir());
        //boolean mkdirs(): 创建指定文件夹，当文件夹所在的目录不存在，则顺着一块创建了
        System.out.println(f3.mkdirs());

        //删除
        //boolean delete(): 当指定文件存在时，删除文件并返回true，否则返回false
        //System.out.println(f.delete());

        //判断
        File ff = new File("a.txt");
        //boolean exists(): 判断文件文件夹是否存在
        System.out.println(ff.exists());
        //boolean isAbsolute(): 判断File对象指向的路径是否是绝对路径，如果是绝对路径则返回true，否则返回false
        ff.createNewFile();
        System.out.println(f.isAbsolute());
        //boolean isDirectory()
        //boolean isFile()
        //boolean isHiddn()
    }
}
