package day11;

/**
 * Created by superzhaolu on 2018/6/11.
 */
public class Test1 {
    static {
        System.out.println("执行静态代码块");
    }


    {
        System.out.println("执行普通代码块");
    }
    public Test1(){
        System.out.println("执行构造方法代码块");
    }
    public static void main(String[] args) {
        System.out.println("执行main方法");
        Test1 t=new Test1();
    }
}
