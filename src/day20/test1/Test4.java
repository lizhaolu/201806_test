package day20.test1;

import java.lang.reflect.Field;

/**
 * Created by superzhaolu on 2018/6/20.
 */
public class Test4 {
    public static void main(String[] args) {
        //获取类
        Class class1=People.class;
        try {
            //创建类的对象
            Object object=class1.newInstance();
            Field field=class1.getDeclaredField("sex");
            //设置属性可用
            field.setAccessible(true);
            field.set(object,"男");
            System.out.println(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
