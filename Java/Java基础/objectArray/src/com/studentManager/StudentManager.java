package com.studentManager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/4 8:57 下午
 * @Description:
 *      步骤如下：
 *          1.定义学生类
 *          2.学生管理系统的主界面的代码编写
 *          3.学生管理系统的查看所有学生的代码编写
 *          4.学生管理系统的添加学生的代码编写
 *          5.学生管理系统的删除学生的代码编写
 *          6.学生管理系统的修改学生的代码编写
 */
public class StudentManager {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            //界面
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.查看所有学生");
            System.out.println("2.添加学生");
            System.out.println("3.删除学生");
            System.out.println("4.修改学生");
            System.out.println("5.退出学生");
            System.out.println("请输入你的选择：");
            //创建键盘录入对象
            Scanner sc = new Scanner(System.in);
            String choiceString = sc.nextLine();
            //用switch语句实现选择
            switch (choiceString) {
                case "1":
                    findAllStudent(array);
                    break;
                case "2":
                    addStudent(array);
                    break;
                case "3":
                    deleteStudent(array);
                    break;
                case "4":
                    updateStudent(array);
                    break;
                case "5":
                    //break;
                default:
                    System.out.println("谢谢你的使用！");
                    System.exit(0);//JVM退出
                    break;
            }
        }
    }

    public static void findAllStudent(ArrayList<Student> array){
        if (array.size() == 0) {
            System.out.println("目前没有学生可供查看，请添加");
        }else {
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getId()+"-"+s.getName()+"-"+s.getAge()+"-"+s.getAddress());
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入学生学号");
            id = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                if (s.getId().equals(id)) {
                    flag = true;//说明学号被占用
                    break;
                }
            }
            if (flag) {
                System.out.println("输入的学号被占用，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生地址");
        String address = sc.nextLine();
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        array.add(student);
        System.out.println("添加成功");
    }

    public static void deleteStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的学生的学号：");
        String id = sc.nextLine();

        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getId().equals(id)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("要删除的不存在");
        }else {
            array.remove(index);
            System.out.println("删除成功");
        }
    }
    public static void updateStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改学生的学号：");
        String id = sc.nextLine();
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getId().equals(id)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("要修改的不存在");
        }else {
            System.out.println("请输入学生新姓名：");
            String name = sc.nextLine();
            System.out.println("请输入学生新年龄：");
            String age = sc.nextLine();
            System.out.println("请输入学生新地址：");
            String address = sc.nextLine();

            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setAge(age);
            student.setAddress(address);
            //修改集合中的学生对象
            array.set(index, student);
            System.out.println("修改成功");
        }
    }
}
