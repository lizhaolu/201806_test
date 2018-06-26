package day19;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(9999);
            while (true) {
                Socket socket = serverSocket.accept();
                InputStream stream = socket.getInputStream();

                byte[] bytes = new byte[1024];
                int i = stream.read(bytes);
                String string = new String(bytes, 0, i);
                System.out.println(string);

                stream.close();
                socket.close();
            }
           // serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
