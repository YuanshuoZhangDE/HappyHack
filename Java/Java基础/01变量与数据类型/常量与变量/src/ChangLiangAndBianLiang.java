/*
    常量：在程序的执行过程中，其值不可以发生改变的量

    常量的分类：
        字符串常量       "HelloWord"
        整数常量         12, -23
        小数常量         12.23
        字符常量         'a', '0'
        布尔常量         true, false
        空常量           null
 */

/*
    变量：是内存中的一小块区域。在程序的执行过程中，其值可以在一定范围内发生改变。

    组成：
        对区域要有限定
            如何限定呢？用数据类型来限定
        必须对区域给定一个名称
            变量名
        区域内必须有内容
            初始化值

    定义格式：
        数据类型 变量名 = 初始值;

    变量定义的注意事项：
        变量未赋值，不能直接使用
        变量只在它所属的范围内有效
            变量属于他所在的那对大括号

    类型转换：
        隐式转换
        强制转换

    隐式转换：
        byte,short,char  -- int -- long -- float -- double
    强制转换：
        目标类型 变量名 = (目标类型)(被转换的数据)；
        建议：数据做运算，结果应该是什么类型，就用什么类型接受，不要随意转换类型，否则会有精度的损失。
 */
public class ChangLiangAndBianLiang {
    public static void main(String[] args){
        //字符串常量
        System.out.println("HelloWorld");

        //整数常量
        System.out.println(12);
        System.out.println(-23);

        //小数常量
        System.out.println(12.23);

        //字符常量
        System.out.println('a');
        System.out.println('0');

        //布尔常量
        System.out.println(true);
        System.out.println(false);

        // 定义比byte类型的变量
        byte a = 10;
        System.out.println(a);

        // 定义short类型的变量
        short s = 100;
        System.out.println(s);

        // 定义int类型的变量
        int i = 1000;
        System.out.println(i);

        // 定义long类型的变量
        long l = 10000000000L;
        System.out.println(l);

        // 定义float类型的变量
        float f = 12.34F;
        System.out.println(f);

        // 定义double类型的变量
        double d = 12.34;
        System.out.println(d);

        // 定义char类型的变量
        char c = 'a';
        System.out.println(c);

        // 定义boolean类型的变量
        boolean b = true;
        System.out.println(b);
    }
}
