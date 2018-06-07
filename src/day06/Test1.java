package day06;

/**
 * Created by superzhaolu on 2018/6/6.
 */
/**
 * 打印九九乘法表
 * */
public class Test1 {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
