package day07;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/7.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={22,1,4,6,77,9,3};
        System.out.println("请输入一个数");
        int input=sc.nextInt();
        boolean b=false;
        for (int i=0;i<a.length;i++){
            if(a[i]==input){
                b=true;
                break;
            }
        }
        if(b){
            System.out.println("猜对了");
        }else {
            System.out.println("sorry");
        }
    }
}
