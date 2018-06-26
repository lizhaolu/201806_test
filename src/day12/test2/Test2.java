package day12.test2;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/12.
 */
public class Test2 {
    public static void main(String[] args) {
        getAge();
    }
    public static int getAge(){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if (age<0||age>120){
            throw new AgeException("年龄应该在0~120之间");
        }else {
            return age;
        }
    }

}
