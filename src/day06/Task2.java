package day06;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/6.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("请输入一个值");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            int j= n-i;
            System.out.println(i+"+"+j+"="+(i+j));

        }
    }
}
