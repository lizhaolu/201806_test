package day19;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class ClientThread extends Thread {
    private String ipAddress;
    private int port;

    public ClientThread(String ipAddress,int port){
        this.ipAddress=ipAddress;
        this.port=port;
    }

    @Override
    public void run() {
        Scanner scanner=new Scanner(System.in);
        while (true){
            try {
                Socket socket=new Socket(ipAddress,port);
                OutputStream stream=socket.getOutputStream();
                stream.write(scanner.next().getBytes());
                stream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
