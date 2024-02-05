package javaCore.exeption;

public class InvalidCharactersException extends Exception{
    private String msg;
    public InvalidCharactersException(String msg){
        super(msg);
        this.msg = msg;
    }
}
