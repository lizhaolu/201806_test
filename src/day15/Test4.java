package day15;

import java.io.*;

/**
 * Created by superzhaolu on 2018/6/15.
 */
public class Test4 {
    public static void main(String[] args) {
        try {
            Reader reader=new FileReader("d:/shixun.txt");
            BufferedReader bReader=new BufferedReader(reader);

            File file=new File("d:/2333.txt");
            file.createNewFile();
            Writer writer =new FileWriter(file);
            BufferedWriter bWriter=new BufferedWriter(writer);
            String string=null;
            while ((string=bReader.readLine())!=null){
                System.out.println(string);
                bWriter.write(string);
                bWriter.newLine();
            }
            bWriter.close();
            writer.close();

            bReader.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
