package day12.test1;

/**
 * Created by superzhaolu on 2018/6/12.
 */
public class TeachFailedException extends Throwable {
    private String message;

    public TeachFailedException(){}

    public TeachFailedException(String message){
        this.message=message;
    }
    @Override
    public  String toString(){
        return "异常"+message;
    }
}
