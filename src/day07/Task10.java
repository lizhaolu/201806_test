package day07;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/7.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=0;
        int sum=0;
        for (;;){
            System.out.println("请输入数字");
            int input=scanner.nextInt();
            if(input==500){
                break;
            }
            count++;
            if (input%2!=0){
                sum+=input;
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
