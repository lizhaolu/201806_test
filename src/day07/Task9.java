package day07;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/7.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入5位正整数");
        int num=sc.nextInt();
        int[] a=new int[5];
        int index=0;
        while (num/10>0){
            int b=num%10;
            a[index++]=b;
            num/=10;
            if(num<10){
                a[index]=num;
            }
        }
        for(int b:a){
            System.out.println(b);
        }
        boolean isHuiWen=true;
        for (int i=0;i<a.length;i++){
            if (a[i]!=a[a.length-i-1]){
                isHuiWen=false;
            }
        }
        System.out.println(isHuiWen);
    }
}
