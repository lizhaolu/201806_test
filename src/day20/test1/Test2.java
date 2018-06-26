package day20.test1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by superzhaolu on 2018/6/20.
 */
public class Test2 {
    public static void main(String[] args) {
        Class c1=People.class;
        try {
            Method method=c1.getMethod("getAge");
            //获取这个方法所在的类
            System.out.println(method.getDeclaringClass());
            //参数
            Class[] parameterType=method.getParameterTypes();
            for (Class c:parameterType){
                System.out.println(c);
            }
            //获取类型
            Class returnType=method.getReturnType();
            System.out.println(returnType);

            //
            Field field=c1.getDeclaredField("age");
            System.out.println(field.getType());
            //field.getModifiers()返回此类或接口以整数编码的java语言修饰符
            System.out.println(Modifier.toString(field.getModifiers()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
