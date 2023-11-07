package exeption;

public class LengthException extends Exception{
    private String msg;
    public LengthException(String msg){
        super(msg);
        this.msg = msg;
    }
}
