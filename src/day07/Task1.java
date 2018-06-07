package day07;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/7.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("请输入会员本月的消费记录");
        Scanner sc=new Scanner(System.in);
        int[] money= new int[5];
        int sum=0;
        for (int i=1;i<=5;i++){
            System.out.println("请输入第"+i+"笔购物金额");
            money[i-1]=sc.nextInt();
        }
        System.out.println("序号\t金额(元)");
        for (int i=1;i<=5;i++){
            System.out.println(i+"\t\t"+money[i-1]);
            sum+=money[i-1];
        }

        System.out.println("总金额\t"+sum);
    }
}
