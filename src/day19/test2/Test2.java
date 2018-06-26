package day19.test2;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class Test2 {
    public static void main(String[] args) {
        Thread mother = new Thread(new MotherThread());
        mother.start();
    }

}
