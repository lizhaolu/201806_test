package day19;

import day14.Score;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class Client {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try {
            while (true) {
                Socket s = new Socket("127.0.0.1", 9999);
                OutputStream stream = s.getOutputStream();
                stream.write(scanner.next().getBytes());

                stream.close();
                s.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
