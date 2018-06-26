package day15;

import java.io.*;

/**
 * Created by superzhaolu on 2018/6/15.
 */
public class Test3 {
    public static void main(String[] args) {
        Reader reader= null;
        try {
            reader = new FileReader("d:/shixun.txt");
            File file=new File("d:/test1.txt");
            try {
                file.createNewFile();
                Writer writer=new FileWriter(file);
                int i=1;
                while ((i=reader.read())!=-1){
                    Character c=(char)i;
                    System.out.println(c);
                    writer.write(i);
                }
                writer.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
