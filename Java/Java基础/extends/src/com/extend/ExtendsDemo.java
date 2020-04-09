package com.extend;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/9 3:16 下午
 * @Description:
 *      继承：多个类有共同的成员变量和方法，抽取到另外一个类中，再让多个类去继承这个父类，这样多个类就可以获取到父类中的内容了
 *      关键字：extends
 *      Java中继承的特点：
 *          Java语言只支持单一继承，只能继承一个父类
 *          Java语言支持多层继承
 *          子类只能获取父类非私有成员
 *          就近原则：
 *              如果有局部变量就使用局部变量
 *              如果没有局部变量，有子类的成员变量就使用子类的成员变量 this.
 *              如果没有局部变量和子类的成员变量，有父类的成员变量就使用父类的成员变量 super.
 *          super: 可以获取父类的成员变量和成员方法，用法和this相似
 *
 *          方法重写的应用场景：
 *              当父类的方法不能完全满足子类使用，这个时候子类重写父类的方法
 *              并可以在方法中使用关键字super调用父类的方法，这样做既可以保有父类的功能，也可以拥有子类特有的功能
 *
 *          方法重写的注意事项：
 *              不能重写父类私有的方法
 *              权限必须大于等于父类方法的权限
 *
 *          继承中构造方法的执行顺序：
 *              在有子类继承关系的类中，创建子类的对象，调用子类的构造方法，如果子类构造方法的第一行代码没有调用父类的构造方法，则会默认
 *              的调用父类的无参构造，可以使用super()在子类构造方法的第一行中调用父类的构造方法。
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        DotA d = new DotA();
        d.start();
    }
}

class Game{
    String name;
    double version;
    String agent;

    public void start(){
        System.out.println("游戏启动");
    }

    public void stop(){
        System.out.println("游戏关闭");
    }
}

class DotA extends Game{

}

class LOL extends Game{

}