package day20.test1;

/**
 * Created by superzhaolu on 2018/6/20.
 */
public class People {

    private String name;
    private int age;
    private String sex;
    private String adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String  getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public People(String name, int age, String  sex, String adress) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.adress = adress;
    }

    public People() {
    }

    public People(int  age, String adress) {
        this.age = age;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
    public  int getSum(int a,int b){
        return a+b;
    }
}
