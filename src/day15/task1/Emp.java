package day15.task1;

/**
 * Created by superzhaolu on 2018/6/15.
 */
public class Emp {
    private int empno;
    private int depno;
    private String name;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public int getDepno() {
        return depno;
    }

    public void setDepno(int depno) {
        this.depno = depno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", depno=" + depno +
                ", name='" + name + '\'' +
                '}';
    }

    public Emp(int empno, int depno, String name) {
        this.empno = empno;
        this.depno = depno;
        this.name = name;
    }

    public Emp(){}
}
