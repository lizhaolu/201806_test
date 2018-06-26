package day19.test3;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        if("父亲".equals(Thread.currentThread().getName())){
            synchronized ("玩具"){
                System.out.println("父亲拿着玩具等待儿子把成绩单拿过来");
                synchronized ("成绩单"){
                    System.out.println("儿子考得很好,给儿子买了新玩具");
                }
            }
        }else if("儿子".equals(Thread.currentThread().getName())){
            synchronized ("成绩单"){
                System.out.println("儿子拿了成绩单等福清把玩具拿过来");
                synchronized ("玩具"){
                    System.out.println("儿子拿到了玩具");
                }
            }
        }
    }
}
