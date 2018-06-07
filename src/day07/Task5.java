package day07;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/7.
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println("请输入4家电的价格");
        Scanner sc=new Scanner(System.in);
        int[] money=new int[5];
        for (int i=1;i<=4;i++){
            System.out.println("第"+i+"店的价格：");
            money[i]=sc.nextInt();
        }
        Arrays.sort(money);
        System.out.println("最低价格是："+money[1]);
    }
}
