package day07;

import java.util.Arrays;

/**
 * Created by superzhaolu on 2018/6/7.
 */
public class Task3 {
    public static void main(String[] args) {
        char[] a=new char[]{'a','c','u','b','e','p','f','z'};
 //降序排列
        for(int i=1;i<a.length;i++){
            int index=-1;
            char temp=a[i];
            for (int j=i-1;j>=0;j--) {
                if (temp > a[j]) {
                    a[j + 1] = a[j];
                } else {
                    index = j;
                    break;
                }
            }
            a[index+1]=temp;
        }
        for (char b:a){
            System.out.print(b+"\t");
        }
        System.out.println();
//升序排列
        for(int i=1;i<a.length;i++){
            int index=-1;
            char temp=a[i];
            for (int j=i-1;j>=0;j--) {
                if (temp < a[j]) {
                    a[j + 1] = a[j];
                } else {
                    index = j;
                    break;
                }
            }
            a[index+1]=temp;
        }
        for (int b:a){
            System.out.print((char) b+"\t");
        }
        char[] newCs=new  char[a.length+1];
        char insert='t';
        newCs[newCs.length-1]=insert;
        Arrays.sort(newCs);
        for (char c:newCs){
            System.out.println(c);
        }
    }
}
