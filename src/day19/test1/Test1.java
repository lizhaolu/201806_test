package day19.test1;

import day19.test1.MyThread;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class Test1 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("线程A ");	// 实例化对象
        MyThread mt2 = new MyThread("线程B ");	// 实例化对象
        mt1.run();				// 调用线程主体
        mt2.run();
    }
}
