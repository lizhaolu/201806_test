package day12.test4;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/12.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入五个整数，用逗号隔开");
        String string= scanner.next();
        String[] ints =string.split(",");
        if(ints==null||ints.length<5||ints.length>5){
            throw new NumberNotEnougthException("需要5个整数");
        }
        int[] is=new int[5];
        for (int i=0;i<5;i++){
        try{
            int int1=Integer.parseInt(ints[i]);
        }catch (NumberFormatException r){
                throw  new CannotParseException("不能将这个转换成数字");
            }
       }
    }
}
