package day12.test1;

/**
 * Created by superzhaolu on 2018/6/12.
 */
public class BlackException extends Exception{
    private String message;

    public BlackException(String message){
        super();
        this.message=message;
    }
    public BlackException(){
        super();
    }
    @Override
    public String toString(){
        return "程序发生异常，异常原因是"+message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
