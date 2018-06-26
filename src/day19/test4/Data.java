package day19.test4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class Data {
    private  static List<String > list=new ArrayList<>();

    public  static void create(){
        synchronized (list){
            if(list.size()==5){
                System.out.println(Thread.currentThread().getName()+"发现面包满了");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println(Thread.currentThread().getName()+"生产了一个面包");
                list.add(Thread.currentThread().getName()+"生产的面包");
            }
        }
    }

    public static void eat(){
        synchronized (list){
            if(list.size()==0){
                System.out.println(Thread.currentThread().getName()+"发现面包吃完，通知厨师");
                list.notifyAll();
            }else {
                System.out.println(Thread.currentThread().getName()+"吃掉一个面包");
                list.remove(0);
            }
        }
    }
}
