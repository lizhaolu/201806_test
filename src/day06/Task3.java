package day06;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/6.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] age=new int[10];
        Scanner sc=new Scanner(System.in);
        int up=0;
        int down=0;
        for (int i=0;i<10;i++){
            System.out.println("请输入第"+i+"位顾客的年龄");
            age[i]=sc.nextInt();
        }
        for (int i=0;i<10;i++) {
            if (age[i] <= 30) {
                up = up + 1;
            } else {
                down = down + 1;
            }
        }
//        System.out.println(up);
        System.out.println("30岁以下的比例是："+(up/10.0*100)+"%");
        System.out.println("30岁以上的比例是："+(down/10.0*100)+"%");
    }
}
