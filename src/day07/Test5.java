package day07;

import java.util.Arrays;

/**
 * Created by superzhaolu on 2018/6/7.
 */
public class Test5 {
    public static void main(String[] args) {
        int[] a=insert(new int[]{1,2,3,5,6,4},89,3);
        for (int c:a){
            System.out.println(c);
        }
    }

    public static int[] insert(int[] a,int obj,int index) {
        if(index<0||index>=a.length){
            System.out.println("插入失败");
            return null;
        }
        int[] b=Arrays.copyOf(a,a.length+1);
        for (int i=a.length-1;i>=index;i--){
            b[i+1]=b[i];
        }
        b[index]=obj;
        return b;
    }
}
