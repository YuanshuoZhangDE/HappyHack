package com.test2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/8 10:34 上午
 * @Description:
 *          把上一题的文本文件中的学生信息读取出来存储到集合中，然后遍历集合，在控制台输出
 */
public class FileToArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Test1.txt"));

        ArrayList<Student> array = new ArrayList<Student>();

        String line;
        while ((line=br.readLine()) != null){
            String[] strArray = line.split(",");
            Student s = new Student(strArray[0], strArray[1], strArray[2], strArray[3]);
            array.add(s);
        }
        br.close();
        //遍历集合
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getId());
        }
    }
}
