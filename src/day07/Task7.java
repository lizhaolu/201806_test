package day07;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/7.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[8];
        int average=0;
        int sum=0;
        for (int i=0;i<a.length;i++){
            System.out.println("请输入"+(i+1)+"个数字");
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        int max=a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]>max){
                max=a[i];

            }
        }System.out.println(max);
        int min=a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]<min){
                min=a[i];

            }
        }
        System.out.println(min);
        System.out.println("接收数据中平均值为："+(sum/8));
    }


}

