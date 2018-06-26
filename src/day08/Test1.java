package day08;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/8.
 */
/**
 * 写一个字符串，判断其是否回文
 * */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入一个五位数字");
        Scanner scanner=new Scanner(System.in);
        String num=scanner.next();
        if (num.charAt(0)==num.charAt(4)&&num.charAt(1)==num.charAt(3)){
            System.out.println("您输入的"+num+"是回文数");
        }else {
            System.out.println("您输入的"+num+"不是回文数");
        }
    }

}
