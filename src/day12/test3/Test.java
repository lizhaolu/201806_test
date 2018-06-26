package day12.test3;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/12.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入提取金额");
        double money=scanner.nextDouble();
        Bank bank=new Bank(10000);
        try {
            bank.withDrowal(money);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
