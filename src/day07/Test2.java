package day07;

/**
 * Created by superzhaolu on 2018/6/7.
 */
public class Test2 {
    public static void main(String[] args) {
        int[][] a=new int[10][10];
        for (int i=0;i<a.length;i++){
            a[i]=new int[i+1];
        }
        for (int i=0;i<a.length;i++){
            a[i][0]=1;
            a[i][i]=1;
            for (int j=1;j<i;j++){
                a[i][j]=a[i-1][j]+a[i-1][j-1];
            }
        }

        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
