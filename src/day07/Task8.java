package day07;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/7.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        int oushuCount=0;
        for (int i=0;i<a.length;i++){
            System.out.println("请输入"+(i+1)+"个数字");
            a[i]=sc.nextInt();
            if(a[i]%2==0){
                oushuCount++;
            }
        }
        System.out.println("数组中下标为奇数的成员是：");
        System.out.println("a[1]="+a[1]);
        System.out.println("a[3]="+a[3]);
        System.out.println("总共输入："+oushuCount+"个偶数");

    }
}
