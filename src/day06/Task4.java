package day06;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/6.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] grade=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("请输入第"+i+"门课的成绩");
            grade[i] = sc.nextInt();
            if(grade[i]<0) {
                System.out.println("抱歉，分数录入错误，请重新进行录入！");
                break;
            }
        }

    }
}
