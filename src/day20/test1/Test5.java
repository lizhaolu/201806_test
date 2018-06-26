package day20.test1;

import java.lang.reflect.Method;

/**
 * Created by superzhaolu on 2018/6/20.
 */
public class Test5 {
    public static void main(String[] args) {
        Class class1=People.class;
        try {
            Object obg=class1.newInstance();
            Method method=class1.getMethod("getSum",new Class[]{int.class,int.class});
            Object obj=method.invoke(obg,new Object[]{20,30});
            System.out.println(obj);

            Method setAgeMethod=class1.getMethod("setAge",new Class[]{int.class});
            Object o=setAgeMethod.invoke(obg,new Object[]{30});
            System.out.println(o);
            System.out.println(obg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
