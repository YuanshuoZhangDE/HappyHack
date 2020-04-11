package com.permissionss;

/**
 * @Author: Yuanshuo
 * @Date: 2020/4/11 9:52 上午
 * @Description:
 *         权限修饰符：
 *                public 当前类、相同包下不同类、不同包下的类
 *                default 当前类、相同包下不同类
 *                private 当前类
 *                protected 当前类、相同包下不同类
 *
 *                default：当前包下使用
 *                protected：让子类对象使用
 *
 *      修饰符
 *                  类           成员变量            成员方法            构造方法
 *
 *      public      √               √                 √                  √
 *
 *      default     √               √                 √                  √
 *
 *      protected   ×               √                 √                  √
 *
 *      private     ×               √                 √                  √
 *
 *      abstract    √               ×                 √                  ×
 *
 *      static      ×               √                 √                  ×
 *
 *      final       √               √                 √                  ×
 *
 *      常见规则：
 *          以后我们使用public来修饰类，一个Java文件中只能有一个类，
 *              如果一个文件中有多个类，类名和文件名一样的类名，必须用public修饰，其他的类不能使用public修饰
 *          以后所有的成员变量都使用private修饰
 *          以后所有的方法都使用public修饰
 *          以后所有的构造方法都使用public修饰
 *              如果不想让创建对象，使用private修饰
 */
public class PermissionsDemo {
    public static void main(String[] args) {
        PermissionsDemo pd = new PermissionsDemo();
        pd.publicMethod();
        pd.defaultMethod();
        pd.privateMethod();
        pd.protectedMethod();
    }

    public void publicMethod(){
        System.out.println("publicMethod");
    }
    void defaultMethod(){
        System.out.println("defaultMethod");
    }
    private void privateMethod(){
        System.out.println("privateMethod");
    }
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }
}
