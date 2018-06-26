package day20.test1;

/**
 * Created by superzhaolu on 2018/6/20.
 */
public class Test {
    public static void main(String[] args) {

        try {
            //初始化给定的类
            Class c1 = Class.forName("day20.test1.People");
            Class c2=String.class;
            Class c3=Integer.TYPE;
            Class c4="asdfg".getClass();
            System.out.println(c1.getName());
            //获取所有公共属性
            System.out.println(c1.getFields().length);
            //获取所有属性
            System.out.println(c1.getDeclaredFields().length);
            System.out.println(c2);
            System.out.println(c3);
            //获取这个类所有的方法
            System.out.println(c1.getDeclaredMethods().length);
            //获取类和父类所有的公共方法
            System.out.println(c1.getMethods().length);
            System.out.println(c1.getMethod("setAge",new Class[]{Integer.TYPE}));
            System.out.println(c1.getConstructors().length);
            System.out.println(c1.getConstructor(new Class[]{Integer.TYPE,String.class}));
            System.out.println(c1.getInterfaces());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
