package day06;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/6.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String user;
        String pass;
        for(int i=3;i!=0;i--) {
            System.out.println("请输入用户名：");
            user=sc.next();
            System.out.println("请输入密码：");
             pass=sc.next();
            if (user.equals("jim") && pass.equals("123456")) {
                System.out.println("欢迎登陆MyShopping");
                break;
            }else {
                System.out.println("输入错误!您还有"+(i-1)+"次机会");
                if((i-1)==0){
                    System.out.println("对不起您3次均输入错误！");
                    break;
                }
            }
        }
    }
}
