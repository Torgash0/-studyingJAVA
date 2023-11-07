package exeption;

public class PasswordConfrimationExceptiom extends Exception{
    private String msg;
    public PasswordConfrimationExceptiom(String msg){
        super(msg);
        this.msg = msg;
    }
}
