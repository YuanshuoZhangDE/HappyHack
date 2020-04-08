package com.test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/8 9:55 上午
 * @Description:
 *          键盘录入三个学生信息(学号，姓名，年龄，居住地)存入集合。然后遍历集合吧每一个学生信息存入文本文件(每一个学生信息为一行数据)
 */
public class ArrayListToFile {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<Student>();
        //键盘录入学生信息，把学生对象作为元素添加到集合
        addStudent(array);
        addStudent(array);
        addStudent(array);
        //将集合写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("Test1.txt"));
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }

    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.print("请输入学生id：");
            id = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                if (s.getId().equals(id)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("该生已存在，请重新输入。");
            }else{
                break;
            }
        }
        System.out.print("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.print("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.print("请输入学生住址：");
        String address = sc.nextLine();
        Student s = new Student(id, name, age, address);
        array.add(s);
    }
}
