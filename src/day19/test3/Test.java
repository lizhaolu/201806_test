package day19.test3;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class Test {
    public static void main(String[] args) {
        Thread thread1=new MyThread("父亲");
        Thread thread2=new MyThread("儿子");

        thread1.start();
        thread2.start();
    }
}
