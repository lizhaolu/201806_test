package day15.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/15.
 */
public class Test {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("1.添加员工信息");
        System.out.println("2.查询所有员工信息");
        System.out.println("3.按编号查询员工信息");
        System.out.println("0.退出");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a){
            case 1:insert();
                menu();
                break;
            case 2:
                try {
                    findEmpo();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                menu();
                break;

            case 3:
                System.out.println("请输入员工编号");
                int no=sc.nextInt();
                try {
                    findByEmpno(no);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                menu();
                break;
            case 0:break;
            default:
                System.out.println("输入数字错误");
                break;
        }
    }
    public static void insert(){
        List<Emp> list=new ArrayList<Emp>();
        Scanner sc=new Scanner(System.in);
        int i=1;
        String c="y";
        while (c.equals("y")) {
            System.out.println("请输入第"+i+"位员工信息");
            System.out.println("请输入"+i+"员工编号");
            int empno=sc.nextInt();
            System.out.println("请输入"+i+"部门编号");
            int depno=sc.nextInt();
            System.out.println("请输入"+i+"员工姓名");
            String name=sc.next();
            System.out.println("是否要继续输入，继续请输入（y）,结束请输入（n）");
            c=sc.next();
            list.add(new Emp(empno,depno,name));
            try {
                add(list);
                i++;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static  void add(List<Emp> list) throws IOException {
        StringBuffer sBuffer=new StringBuffer();
        for(Emp emp:list){
            sBuffer.append(emp.getEmpno()+","+emp.getDepno()+","+emp.getName()+"#");
        }
        sBuffer.deleteCharAt(sBuffer.length()-1);

        File file=new File("d:/test3.txt");
        file.createNewFile();
        Writer writer=new FileWriter(file,true);
        BufferedWriter bufferedWriter=new BufferedWriter(writer);
        bufferedWriter.append(sBuffer.toString()+"#");
        bufferedWriter.close();
        writer.close();
    }

    public static void findEmpo() throws IOException {
        File file=new File("d:/test3.txt");
        Reader reader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(reader);
        String string=bufferedReader.readLine();
        List<Emp> list=stringTolist(string);
        for(Emp emps:list){
            System.out.println(emps);
        }
    }

    public static Emp findByEmpno(int empno) throws IOException {
        File file=new File("d:/test3.txt");
        Reader reader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(reader);
        String string=bufferedReader.readLine();
        List<Emp> list=stringTolist(string);
        for (Emp e:list){
            if(e.getEmpno()==empno){
                System.out.println(e);
            }else {
                System.out.println("没有找到符合条件的员工");
            }
        } return null;
    }

    public static List<Emp> stringTolist(String string){
        List<Emp> list=new ArrayList<>();
        String[] split=string.split("#");
        for(String s:split){
            String[] empArray=s.split(",");
            Emp emp=new Emp(Integer.parseInt(empArray[0]),Integer.parseInt(empArray[1]),empArray[2]);
            list.add(emp);
        }
        return list;
    }
}
