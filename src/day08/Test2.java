package day08;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/8.
 */
/**
 * 编写代码从字符串中删除某个字符串
 * */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("Hello World!!!!");
        String old="Hello World!!!!";
        System.out.println("请输入您要删除第几个字符到第几个字符");
        Scanner scanner=new Scanner(System.in);
        int begin=scanner.nextInt();
        int end=scanner.nextInt();
        String after=old.substring(0,begin-1)+old.substring(end);
        System.out.println("截取后的字符串为"+after);

    }



}
