package day08;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/8.
 */
public class Test9 {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String str3=scanner.next();
//        String str4=scanner.next();
//        StringBuffer str1=new StringBuffer();
//        StringBuffer str2=new StringBuffer();
//        str1.append(str3);
//        str2.append(str4);
//        Boolean b=true;
//        if (str1 == null || str2 == null){
//            b=false;
//        }
//        if (str1.length() != str2.length()){
//            b=false;
//        }
//        for (int i = 0; i < str1.length(); i++) {
//            if (str1.charAt(i) != str2.charAt(i)) {
//                b=false;
//            }
//        }
//        if (b){
//            System.out.println("相等");
//        }else {
//            System.out.println("不相等");
//        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数字");
        StringBuffer str1=new StringBuffer(scanner.next());
        System.out.println("请输入第二个数字");
        StringBuffer str2=new StringBuffer();
        str2.append(scanner.next());
        if (str1.toString().equals(str2.toString())){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
    }
}
