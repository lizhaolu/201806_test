package day19.test4;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class Test {
    public static void main(String[] args) {
        Thread chef1=new ChefThread("厨师1");
        Thread chef2=new ChefThread("厨师2");
        Thread chef3=new ChefThread("厨师3");
        Thread chef4=new ChefThread("厨师4");
        Thread chef5=new ChefThread("厨师5");

        Thread cus1=new CustomerThead("顾客1");
        Thread cus2=new CustomerThead("顾客2");
        Thread cus3=new CustomerThead("顾客3");

        chef1.start();
        chef2.start();
        chef3.start();
        chef4.start();
        chef5.start();
        cus1.start();
        cus2.start();
        cus3.start();
    }
}
