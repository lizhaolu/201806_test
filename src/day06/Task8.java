package day06;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/6.
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num>=1&&num<=10){
            int sum=1;
            System.out.print(num+"!=");
            for (int i=1;i<=num;i++){
                sum*=i;
                System.out.print(i+(i==num?"=":"*"));
            }
            System.out.println(sum);
        }else {
            System.out.println("数据无效");
        }
    }
}
