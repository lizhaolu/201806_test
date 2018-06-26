package day19.test4;

import java.util.Date;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class ChefThread extends Thread {
    public ChefThread(String name){
        super(name);
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Data.create();
        }
    }
}
