package day14;

import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/14.
 */
public class MyCompare implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Score score1=(Score)o1;
        Score score2=(Score)o2;
        double sum1 = score1.getEnglish()+score1.getJava()+score1.getMath();
        double sum2=score2.getEnglish()+score2.getMath()+score2.getJava();
        return Double.compare(sum1,sum2);
    }
}
