package day07;

import java.util.Arrays;

/**
 * Created by superzhaolu on 2018/6/7.
 */
public class Test4 {
    public static void main(String[] args) {
        int[] a={11,34,2,4,44,67,43};
        a=high(a);
        for (int i=0;i<7;i++){
            System.out.print(a[i]+"\t");
        }
    }

    public static int[] high(int[] a){
        Arrays.sort(a);
        return a;
    }
}
