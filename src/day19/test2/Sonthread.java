package day19.test2;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class Sonthread implements Runnable {

    @Override
    public void run() {
        System.out.println("儿子出门去买米酒");
        System.out.println("儿子买东西来回需要5分钟");

        try {
            for (int i=1; i<=5; i++)
            {
                Thread.sleep(2000);
                System.out.print(i+"分钟 ");
            }
        }
        catch (InterruptedException ie)
        {
            System.err.println("儿子发生意外");
        }

        System.out.println("\n儿子买米酒回来了");

    }
}
