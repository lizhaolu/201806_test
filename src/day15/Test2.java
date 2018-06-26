package day15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by superzhaolu on 2018/6/15.
 */
public class Test2 {
    public static void main(String[] args) {
        File file =new File("d:/shixun.txt");
        try {
            file.createNewFile();
            Writer writer=new FileWriter(file);
            writer.write("杨晓辉是个傻子");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
