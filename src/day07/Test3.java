package day07;

/**
 * Created by superzhaolu on 2018/6/7.
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(maxNum(3,6,12));
    }
    public static float maxNum(float a,float b,float c){
        float max=0;
        if (a>b){
            if (a>c){
                max=a;
            }else {
                max=c;
            }
        }else {
            if (b>c){
                max=b;
            }else {
                max=c;
            }
        }
        return max;
    }
}
