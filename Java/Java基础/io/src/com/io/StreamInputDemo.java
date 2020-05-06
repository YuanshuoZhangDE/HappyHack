package com.io;

import java.io.*;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/22 3:59 下午
 * @Description:
 *      标准输入输出流：
 *          public static final InputStream in : 字节输入流，用来读取键盘录入的数据
 *              public static final int x;
 *              InputStream is = System.in;
 *              Scanner sc = new Scanner(System.in);
 *          public static final PrintStream out : 字节输出流，将数据输出到命令行
 *              System.out.println();
 *
 *          需求：读取项目根目录下的BufferedStreamDemo.java，并输出到命令行
 *          由于标准输出流是一个字节输出流，所以只能输出字节或者字节数组，但是我们读取到的数据则是字符串，如果想进行输出还需要转换成字符串
 *          我们要想通过标准输出流输出字符串，把标准输出流转换成一种字符输出流即可，OutputStreamWriter
 *
 */
public class StreamInputDemo {
    public static void main(String[] args) throws IOException {
        //method();
        //method2();
        //创建输入流对象
        BufferedReader br = new BufferedReader(new FileReader("src//com//io//BufferedStreamDemo.java"));
        //创建输出流对象
        //OutputStream os = System.out;
        Writer w = new OutputStreamWriter(System.out);//多态，父类型引用指向子类对象
        BufferedWriter bw = new BufferedWriter(w);
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }
        //释放对象
        bw.close();
        br.close();
    }

    private static void method2() throws IOException {
        //创建输入流对象
        BufferedReader br = new BufferedReader(new FileReader("src//com//io//BufferedStreamDemo.java"));
        //创建输出流对象
        //OutputStream os = System.out;
        Writer w = new OutputStreamWriter(System.out);//多态，父类型引用指向子类对象
        String line;
        while ((line = br.readLine()) != null) {
            w.write(line);
            w.write("\n");
        }
        //释放对象
        w.close();
        br.close();
    }

    private static void method() throws IOException {
        //创建输入流对象
        BufferedReader br = new BufferedReader(new FileReader("src//com//io//BufferedStreamDemo.java"));
        //创建输出流对象
        OutputStream os = System.out;
        String line;//用于存储读取到的数据
        while ((line = br.readLine()) != null){
            os.write(line.getBytes());
            os.write("\r\n".getBytes());
        }
        //释放对象
        os.close();
        br.close();
    }
}
