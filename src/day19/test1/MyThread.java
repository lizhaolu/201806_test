package day19.test1;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class MyThread extends Thread {
    private String name;
    public MyThread(String name){
        this.name=name;
    }

    public MyThread(){}

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "运行，i = " + i);
        }

    }
}
