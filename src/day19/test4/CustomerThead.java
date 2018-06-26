package day19.test4;

import java.util.Date;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class CustomerThead extends Thread {
    public CustomerThead(String name){
        super(name);
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Data.eat();
        }
    }
}
