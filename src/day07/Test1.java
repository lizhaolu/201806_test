package day07;

/**
 * Created by superzhaolu on 2018/6/7.
 */
public class Test1 {
    public static void main(String[] args) {
        int[] a={7,4,8,16,13,5,9,28,1};
        for(int i=1;i<a.length;i++){
            int index=-1;
            int temp=a[i];
            for (int j=i-1;j>=0;j--){
                if(temp<a[j]){
                    a[j+1]=a[j];
                }else {
                    index=j;
                    break;
                }
            }
            a[index+1]=temp;
        }
        for (int b:a){
            System.out.println(b);
        }
    }
}
