package com.interfacee;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/10 4:16 下午
 * @Description:
 *          Java语言的继承是单一继承，一个子类只能有一个父类，
 *          Java语言提供一种机制，用于处理继承单一的局限性的，接口
 *
 *          接口：是一个比抽象类还抽象的类，接口里所有的方法全是抽象方法，接口和类的关系是实现，implements
 *          关键字：interface
 *          格式：
 *              interface 接口名{
 *
 *              }
 *          接口的成员特点：
 *              只能有抽象方法
 *              只能有常量
 *              默认使用public abstract修饰方法
 *              只能使用public abstract修饰方法
 *              默认使用public static final来修饰成员变量
 *
 *          注意：
 *              接口不能创建对象，不能实例化
 *              类与接口的关系是实现关系，一个类实现一个接口必须实现它所有的方法
 *
 *          类与类：继承关系，单一继承，多层继承
 *          类与接口：实现关系，多实现
 *          接口与接口：继承关系，多继承
 *
 *          接口的优点：
 *              1.类与接口的关系，实现关系，而且是多实现，一个类可以实现多个接口，打破了继承的局限性
 *              2.对外提供规则（USB接口）
 *              3.降低了程序的耦合性，可以实现模块化开发，提高开发效率
 *
 *          接口与抽象类的区别：
 *              共性：
 *                  不断的抽取，抽取出抽象的概念
 *              区别：
 *                  与类的关系：
 *                      类与接口是实现关系，而且是多实现，一个类可以是多个接口
 *                      类与抽象类是继承关系，Java中的继承是单一继承，一个类只能有一个父类，Java中的继承是多层继承
 *                  成员方法：
 *                      抽象类可以有抽象方法，可以有非抽象方法
 *                      接口只能有抽象方法，而且方法默认修饰符 public abstract
 *                  构造方法：
 *                      抽象类有构造方法
 *                      接口没有构造方法
 *
 */
public class InterfaceDemo {
    public static void main(String[] args) {

    }
}

interface Animal{
    int age = 10;
    void eat();
}

class Dog implements Animal{

    @Override
    public void eat() {

    }
}

