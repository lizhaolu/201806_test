package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by superzhaolu on 2018/6/14.
 */
public class Test1 {
    public static void main(String[] args) {
        List list=new ArrayList();
        Score score=new Score();
        score.setJava(100);
        score.setEnglish(100);
        score.setMath(98);
        list.add(score);
        score.setJava(95);
        score.setMath(96);
        score.setEnglish(98);
        list.add(score);
        score.setJava(78.5);
        score.setMath(97);
        score.setEnglish(65);
        list.add(score);

        MyCompare compare=new MyCompare();
        Collections.sort(list,compare);
        for(Object score1:list){
            System.out.println(score1.toString());
        }

    }
}
