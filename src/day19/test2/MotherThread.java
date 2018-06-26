package day19.test2;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class MotherThread implements Runnable{

    @Override
    public void run() {
        System.out.println("妈妈准备煮饭");
        System.out.println("妈妈发现米酒用完了");
        System.out.println("妈妈叫儿子去买米酒");

        Thread son = new Thread(new Sonthread());    //儿子线程创建
        son.start();                                   //启动儿子线程
        System.out.println("妈妈等待儿子把米酒买回来");

        try {

            son.join();                 //儿子线程加入，并获得资源开始运行
        }
        catch (Exception ie)
        {
            System.err.println("发生异常！");
            System.err.println("妈妈中断煮饭");
            System.exit(1);
        }

        System.out.println("妈妈开始煮饭");        //妈妈线程继续运行
        System.out.println("妈妈把饭煮好了");
    }


}

