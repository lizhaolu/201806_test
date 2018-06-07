package day06;

/**
 * Created by superzhaolu on 2018/6/6.
 */
public class Task9 {
    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<=1000;i++){
            if(i%5==0){
                System.out.print(i+"\t\t");
                count+=1;
            }
            if(count%8==0){
                System.out.println();
            }
        }
        System.out.println("5的倍数总共"+count+"个");
    }
}
