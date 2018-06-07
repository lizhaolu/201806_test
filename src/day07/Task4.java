package day07;

import java.util.Arrays;

/**
 * Created by superzhaolu on 2018/6/7.
 */
public class Task4 {
    public static void main(String[] args) {
        char[] a=new char[]{'a','c','u','b','e','p','f','z'};
        char[] newCs=new  char[a.length+1];
        char insert='t';
        for (int i=0;i<a.length;i++){
            newCs[i]=a[i];
        }
        newCs[newCs.length-1]=insert;
        Arrays.sort(newCs);
        for (char c:newCs){
            System.out.print(c+"\t");
        }
    }
}
