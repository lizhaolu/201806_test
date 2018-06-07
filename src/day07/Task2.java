package day07;

import java.util.Arrays;

/**
 * Created by superzhaolu on 2018/6/7.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] a={99,85,82,63,60};
        Arrays.sort(a);
        for (int i=0;i<a.length/2;i++){
            int temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }

//        for(int i=1;i<a.length;i++){
//            int index=-1;
//            int temp=a[i];
//            for (int j=i-1;j>=0;j--) {
//                if (temp > a[j]) {
//                    a[j + 1] = a[j];
//                } else {
//                    index = j;
//                    break;
//                }
//            }
//            a[index+1]=temp;
//        }

        for (int c:a){
            System.out.print(c+"\t");
        }
        System.out.println();

        int[] newScores=new int[a.length+1];
        for (int i=0;i<a.length;i++){
            newScores[i]=a[i];
        }
        int insert=100;
        boolean b=true;
        for(int i=a.length-1;i>=0;i--){
            if(insert>newScores[i]){
                newScores[i+1]=newScores[i];
            }else {
                b=false;
                newScores[i+1]=insert;
                break;
            }
        }
        if(b){
            newScores[0]=insert;
        }
        for (int c:newScores){
            System.out.print(c+"\t");
        }
    }
}
