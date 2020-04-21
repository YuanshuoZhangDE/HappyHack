package com.filedemo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.File;
import java.io.IOException;
import java.util.Date;

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
        //boolean isDirectory(): 判断File对象指向的路径是否是文件夹，是则返回true，否则返回false
        System.out.println(f2.isDirectory());
        //boolean isFile(): 判断File对象指向的路径是否是文件，是则返回true，否则返回false
        System.out.println(ff.isFile());
        //boolean isHiddn(): 判断File对象指向的路径是否隐藏，是则返回true，否则返回false
        System.out.println(ff.isHidden());

        //获取
        //File getAbsoluteFile(): 以File对象的形式返回当前File对象所有指向的绝对路径
        System.out.println(f.getAbsoluteFile());
        //String getAbsolutePath()： 返回File对象所指向的绝对路径
        System.out.println(f.getAbsolutePath());
        //String getName(): 获取文件和文件夹的名称
        System.out.println(f.getName());
        //String getParent()：返回文件父路径
        System.out.println(f.getParent());
        //File getParentFile()：返回文件父路径
        System.out.println(f.getParentFile());
        //String getPath()：返回创建File对象给的路径
        System.out.println(ff.getPath());
        System.out.println(f3.getPath());
        //long lastModified()：以毫秒值的形式返回最后的修改时间
        System.out.println(f.lastModified());
        Date d = new Date(f.lastModified());
        System.out.println(d.toLocaleString());
        //long length(): 返回文件的字节数
        System.out.println(f.length());

        //修改
        //boolean renameTo(File dest)：将当前File对象所指向的路径 修改为 指定File所指向的路径
        //注意：修改的文件路径不能存在，如果存在则修改失败
        System.out.println(ff.renameTo(f));
    }
}
