package day08;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/8.
 */

/**
 * 编写程序，模拟trim的功能，去除字符串两段的空格
 * */
public class Test7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一段字符串");
        String str=scanner.next();
        my_trim(str);
        System.out.println(str.length());
    }
    public static String my_trim(String str)
    {
        int start = 0,end = str.length()-1;
        while(start<=end && str.charAt(start)==' ') {
            start++;
        }
        while(start<=end && str.charAt(end)==' '){
            end--;
        }
        return str.substring(start,end+1);

    }
}
