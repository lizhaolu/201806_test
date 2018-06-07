package day06;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/6.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入会员号（4位整数）:");
            int count = 1;
            int num = sc.nextInt();
            int num1=num;
            while (num / 10 > 0) {
                count++;
                num /= 10;
            }
            if (count == 4) {
                System.out.println("请输入会员生日(月/日<用两位整数表示>):");
                String date = sc.next();
                System.out.println("请输入会员积分:");
                int grade = sc.nextInt();
                System.out.println("您录入的会员信息是：");
                System.out.println(num1 + "\t" + date + "\t" + grade);
            }else {
                System.out.println("录入失败");
                break;
            }
        }
    }
    }

