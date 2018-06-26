package day20.test1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/20.
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入类名");
        String className=scanner.next();
        try {

            Class c=Class.forName(className);
            Object object=c.newInstance();
            System.out.println(object);
            Constructor constructor=c.getDeclaredConstructor(new Class[]{int.class,String.class});
            Object object1=constructor.newInstance(new Object[]{20,"ruykb"});
            People people=(People)object1;
            System.out.println(people.getAge());
            System.out.println(people.getAdress());
            System.out.println(object1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
