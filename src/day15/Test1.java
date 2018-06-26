package day15;

import java.io.*;

/**
 * Created by superzhaolu on 2018/6/15.
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            InputStream stream=new FileInputStream("d:/篮球赛.jpg");
            File file=new File("d:/we.jpg");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            OutputStream stream1=new FileOutputStream(file);
            int i=-1;
            long start =System.currentTimeMillis();
            try {
                while ((i=stream.read())!=-1){
                    System.out.println(i);
                    try {
                        stream1.write(i);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            long end=System.currentTimeMillis();

            try {
                stream.close();
                stream1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("复制耗时："+(end-start)+"毫秒");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
