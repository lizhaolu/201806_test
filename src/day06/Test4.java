package day06;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/6.
 */
public class Test4 {
    public static void main(String[] args) {
        int ran=(int)(Math.random()*1000);
        System.out.println(ran);
        System.out.println("请输入1~1000的数字");
        Scanner sc=new Scanner(System.in);
        int num=0;
        int grade=100;
        do{
            num=sc.nextInt();
            if(num>ran){
                System.out.println("猜大了");
                grade=grade-5;
            }else if(num<ran){
                System.out.println("猜小了");
                grade=grade-5;
            }
        }while (num!=ran&&grade>0);
        if (grade==0){
            System.out.println("很遗憾！成绩已经为零，正确答案是"+ran);
        }else {
        System.out.println("猜对了"+"成绩是"+grade);
        }
    }

}
