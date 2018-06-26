package day08;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/8.
 */

/**
 * 输入两个字符串，计算其中一个字符串在另一个字符串中出现的次数
 * */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入给定的字符串");
        String max=scanner.next();
        System.out.println("请输入要查找的字符串");
        String min =scanner.next();
        int index=0;
        int count=0;
        while ((index=max.indexOf(min))!=-1){
            count++;
            max=max.substring(index+min.length());
        }
        System.out.println(count);
    }
}
