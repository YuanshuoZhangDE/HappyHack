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
 */
public class changliagnAndBainliang {
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
    }
}
