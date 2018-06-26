package day08;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/8.
 */
/**
 * 给定一个由数字组成的字符串,如:"1239586838923173478943890234092",统计出每个数字出现的次数
 * */
public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入纯数字的字符串：");
        String string = scanner.next();
        appNum(string);
    }

    public static void appNum(String s) {
        char[] a=s.toCharArray();
        for (int i=0;i<10;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if (i==a[j]-48){
                    count++;
                }
            }
            System.out.println(i+"出现的次数是"+count+"次");
        }
    }
}
