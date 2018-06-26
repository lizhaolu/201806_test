package day12.test3;

/**
 * Created by superzhaolu on 2018/6/12.
 */
public class Bank extends Exception {
    private double balance;

     public Bank(double balance){
         this.balance=balance;
     }

     public  double withDrowal(double dAmount) throws Exception {
         if (dAmount > balance) {
             throw new Exception("取款金额大于余额");
         } else if (dAmount < 0) {
             throw new Exception("取款金额大于0");
         } else {
             balance -= dAmount;
         }
         return dAmount;
     }
}
