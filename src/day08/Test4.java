package day08;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/8.
 */

/**
 * 实现注册功能，提示用户录入用户名、密码、邮箱等数据，如果有不合要求的数据，提示并让重新输入
 * */
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(;;){
            System.out.println("请输入用户名(以小写字母组成)");
            String username = scanner.next();
            System.out.println("请输入密码(以数字和26个英文字母组成的字符串)");
            String password = scanner.next();
            System.out.println("请输入邮箱");
            String email = scanner.next();
            if (username.matches("^[a-z]+$")) {
                System.out.println("用户名合法");
                if (password.matches("^[A-Za-z0-9]+$")) {
                    System.out.println("密码合法");
                    if (email.matches("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$")) {
                        System.out.println("邮箱合法");
                    } else {
                        System.out.println("邮箱不合法");
                    }
                } else {
                    System.out.println("密码不合法");
                }
            } else {
                System.out.println("用户名不合法");
            }
        }
    }
}
