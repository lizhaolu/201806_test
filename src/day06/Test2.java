package day06;

/**
 * Created by superzhaolu on 2018/6/6.
 */
public class Test2 {
    public static void main(String[] args) {
        Boolean is;
        for(int i=101;i<201;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int i){
        for(int j=2;j<i;j++){
            if(i%j==0) {
                return false;
            }
        }
        return true;
    }
}
