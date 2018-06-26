package day19;

/**
 * Created by superzhaolu on 2018/6/19.
 */
public class C1 {
    public static void main(String[] args) {
        Thread server=new ServerThread(8888);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread client=new ClientThread("127.0.0.1",9999);
        server.start();
        client.start();
    }
}
