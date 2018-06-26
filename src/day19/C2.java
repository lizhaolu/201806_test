package day19;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class C2 {
    public static void main(String[] args) {
        Thread server=new ServerThread(9999);
        Thread client=new ClientThread("127.0.0.1",8888);
        server.start();
        client.start();
    }
}
