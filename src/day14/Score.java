package day14;

/**
 * Created by superzhaolu on 2018/6/14.
 */
public class Score {
    private double java;
    private double english;
    private double math;

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "Score{" +
                "java=" + java +
                ", english=" + english +
                ", math=" + math +
                '}';
    }
}
