package day12.test2;

/**
 * Created by superzhaolu on 2018/6/12.
 */
public class AgeException extends RuntimeException {
    public String message;

    public AgeException(String message){
        super();
        this.message=message;
    }

    public AgeException(){
        super();
    }

    @Override
    public String toString(){
        return "发生异常，异常原因是"+message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
