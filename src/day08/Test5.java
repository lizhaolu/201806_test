package day08;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/8.
 */
/**
 *给定一个长度,随机产生一个该长度的字符串,由大写,小写字母以及数字组成

 * */
public class Test5 {
//    private static String randomStr ( int len )
//    {
//        if (len == 0)
//        {
//            return "";
//        }
//        int a = (int) ( Math.random () * 3 );
//        if (a == 0)
//        {
//            return ( (int) ( Math.random () * 10 ) ) + randomStr (len - 1);
//        }
//        else if (a == 1)
//        {
//            return ( (char) ( (int) ( Math.random () * 26 ) + 65 ) ) + randomStr (len - 1);
//        }
//        else
//        {
//            return ( (char) ( (int) ( Math.random () * 26 ) + 97 ) ) + randomStr (len - 1);
//        }
//    }
//
//    public static void main ( String[] args )
//    {
//        System.out.println (randomStr (3));
//    }
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("请输入长度");
    int count= scanner.nextInt();
    int time=0;
    char[] cs=new char[count];
    for(int i=0;i<count;i++){
        int num=(int)(Math.random()*123);
        if((num>=48&&num<=57)||(num>=65&&num<=90)||(num>=67&&num<=122)){
            char c=(char)num;
            cs[time++]=c;
            if (time==count){
                break;
            }
        }
    }
    String result=new String(cs);
    System.out.println(result);
}
}
