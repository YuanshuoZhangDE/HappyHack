package com.studentManger;

import com.studentManger.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/6 3:18 下午
 * @Description:
 *          步骤如下：
 *  *          1.定义学生类
 *  *          2.学生管理系统的主界面的代码编写
 *  *          3.学生管理系统的查看所有学生的代码编写
 *  *          4.学生管理系统的添加学生的代码编写
 *  *          5.学生管理系统的删除学生的代码编写
 *  *          6.学生管理系统的修改学生的代码编写
 */
public class StudentManger {
    public static void main(String[] args) {

        ArrayList<Student> array = new ArrayList<>();
        while (true){
        System.out.println("--------欢迎来到学生管理系统--------");
        System.out.println("1.查看所有学生");
        System.out.println("2.添加学生");
        System.out.println("3.删除学生");
        System.out.println("4.修改学生");
        System.out.println("5.退出");
        System.out.print("请输入你的选择：");

        Scanner sc = new Scanner(System.in);
        String choiceString = sc.nextLine();

        switch (choiceString) {
            case "1":
                findAllStudent(array);
                break;
            case "2":
                addStudeny(array);
                break;
            case "3":
                delStudent(array);
                break;
            case "4":
                updateStudent(array);
                break;
            case "5":
                //break;
            default:
                System.out.println("谢谢您的使用！");
                System.exit(0);
                break;
            }
        }
    }
    public static void findAllStudent(ArrayList<Student> array){
        if (array.size() == 0) {
            System.out.println("当前没有学生可供查看，请添加");
        }else {
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println("ID:"+s.getId()+"\tNAME:"+s.getName()+"\tAGE:"+s.getAge());
            }
        }
    }
    public static void addStudeny(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.print("请输入学号：");
            id = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < array.size(); i++) {
                Student student = array.get(i);
                if (student.getId().equals(id)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("要添加的学号已被占用，请重新输入，");
            }else {
                break;
            }
        }
        System.out.print("请输入姓名：");
        String name = sc.nextLine();
        System.out.print("请输入年龄：");
        String age = sc.nextLine();
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setAge(age);
        array.add(s);
        System.out.println("添加成功！");
    }
    public static void delStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入需要删除的学生的学号：");
        String id = sc.nextLine();
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getId().equals(id)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("要删除的学生不存在。");
        }else {
            array.remove(index);
            System.out.println("删除成功！");
        }
    }
    public static void updateStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要修改学生的学号：");
        String id = sc.nextLine();
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getId().equals(id)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("要修改的学生学号不存在！");
        }else {
            System.out.print("请输入学生的新姓名：");
            String name = sc.nextLine();
            System.out.print("请输入学生的新年龄：");
            String age = sc.nextLine();
            Student s = new Student(id, name, age);
            array.set(index, s);
            System.out.println("修改成功！");
        }
    }
}
