package day12.test4;

/**
 * Created by superzhaolu on 2018/6/12.
 */
public class CannotParseException extends RuntimeException {
    public String message;

    public CannotParseException(String message){
        super();
        this.message=message;
    }

    public CannotParseException(){
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
