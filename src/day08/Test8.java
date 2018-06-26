package day08;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/8.
 */

/**
 * 编写程序，模拟equals的功能，实现比较两个字符串是否一样
 * */
public class Test8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数字");
        String str1=scanner.next();
        System.out.println("请输入第二个数字");
        String str2=scanner.next();
        if(compare(str1,str2)){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
    }

    public static boolean compare(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        Boolean b = true;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                b = false;
            }
        }
        return b;
    }
}
