package day06;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/6.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int grade=0;
        double averge=0;
        for(int i=1;i<=10;i++){
            System.out.println("请输入第"+i+"名学员的JAVA成绩");
            grade=sc.nextInt();
            if(grade<1||grade>100){
                System.out.println("成绩无效");
                break;
            }
            sum+=grade;
        }
        averge=sum/10.0;
        System.out.println("该班平均成绩为"+averge);
        if(averge<=100&&averge>=90){
            System.out.println("该班学员的等级为A");
        }else if(averge<=89&&averge>=80){
            System.out.println("该班学员的等级为B");
        }else if(averge<=79&&averge>=70){
            System.out.println("该班学员的等级为C");
        }else if(averge<=69&&averge>=60){
            System.out.println("该班学员的等级为D");
        }else if(averge<60){
            System.out.println("该班学员的等级为E");
        }
    }
}
