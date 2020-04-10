package com.interfacee;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/10 7:51 下午
 * @Description:
 *          篮球运动员和教练
 *          乒乓球运动员和教练
 *          现在篮球运动员和教练要出国访问，需要学习英语
 *          请根据所学的知识，分析出哪些是类，哪些是抽象类，哪些是接口
 *
 *      分析：
 *          由下至上    不断向上抽取的过程
 *
 *      实现：
 *          由上至下    先实现共性
 *
 *      使用：
 *          使用具体的子类
 */
public class InterfacePractice {
    public static void main(String[] args) {
        //创建篮球运动员对象
        BasketballPlayer bp = new BasketballPlayer();
        bp.name = "姚明";
        bp.age = 18;
        bp.gender = "男";
        bp.sleep();
        bp.eat();
        bp.speak();
        //创建乒乓球教练对象
        PingpongCoach pc = new PingpongCoach();
        pc.teach();
        pc.eat();
    }
}
//人类
class Person{
    String name;
    int age;
    String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}
//说英语接口
interface SpeakEnglish{
    public abstract void speak();
}
//运动员抽象类
abstract class Player extends Person{
    public abstract void study();
}
//教练抽象类
abstract class Coach extends Person{
    public abstract void teach();
}
//篮球运动员
class BasketballPlayer extends Player implements SpeakEnglish{
    @Override
    public void study() {
        System.out.println("学打篮球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
//乒乓球运动员
class PingpongPlayer extends Player{
    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }
}
//篮球教练
class BaskerballCoach extends Coach implements SpeakEnglish{
    @Override
    public void teach() {
        System.out.println("教打篮球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
//乒乓球教练
class PingpongCoach extends Coach{
    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }
}