package com.objectArray;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/4 7:50 下午
 * @Description:
 *      创建一个学生数组，存储三个学生对象并遍历
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建学生数组
        Student[] students = new Student[3];
        //创建学生对象
        Student student1 = new Student("曹操", 40);
        Student student2 = new Student("刘备", 35);
        Student student3 = new Student("孙权",30);
        //把学生对象作为元素赋值给学生数组
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (int i = 0; i < students.length; i++) {
            //Student student = students[i];
            System.out.println(students[i].getAge()+students[i].getName());
        }
    }
}
