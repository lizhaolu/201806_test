package day15.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/15.
 */
public class Test {
    public static void main(String[] args) {
        List<Emp> list=new ArrayList<Emp>();
        list.add(new Emp(1001,11,"qwe"));
        list.add(new Emp(1002,12,"dwe"));
        list.add(new Emp(1003,13,"awe"));
        list.add(new Emp(1004,14,"gwe"));
        try {
            add(list);
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            Emp people=findByEmpno(num);
            System.out.println(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static  void add(List<Emp> list) throws IOException {
        StringBuffer sBuffer=new StringBuffer();
        for(Emp emp:list){
            sBuffer.append(emp.getEmpno()+","+emp.getDepno()+","+emp.getName()+"#");
        }
        sBuffer.deleteCharAt(sBuffer.length()-1);

        File file=new File("d:/test2.txt");
        file.createNewFile();
        Writer writer=new FileWriter(file,true);
        BufferedWriter bufferedWriter=new BufferedWriter(writer);
        bufferedWriter.append(sBuffer.toString());
        bufferedWriter.close();
        writer.close();
    }

    public static Emp findByEmpno(int empno) throws IOException {
        File file=new File("d:/test2.txt");
        Reader reader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(reader);
        String string=bufferedReader.readLine();
        List<Emp> list=stringTolist(string);
        for (Emp e:list){
            if(e.getEmpno()==empno){
                return e;
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
