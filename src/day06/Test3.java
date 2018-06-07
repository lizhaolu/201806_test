package day06;

/**
 * Created by superzhaolu on 2018/6/6.
 */
public class Test3 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        int sum=0;
        for(int i=100;i<1000;i++){
            a=i/100;
            b=i%100/10;
            c=i%10;
            sum=a*a*a+b*b*b+c*c*c;
            if (i==sum){
                System.out.println(i);
            }
        }
    }
}
