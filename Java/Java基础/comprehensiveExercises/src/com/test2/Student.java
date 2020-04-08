package com.test2;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/8 10:37 上午
 * @Description:
 */
public class Student {
    private String id;
    private String name;
    private String age;
    private String adderss;

    public Student() {
    }

    public Student(String id, String name, String age, String adderss) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adderss = adderss;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }
}
