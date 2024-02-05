package javaCore.exeption;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args) {
        Registration registration = new Registration();
        try {
            registration.vadateRegistration("lalla", "xffx", "xffx");
        } catch (EmptyLoginException e ) {
            e.printStackTrace();
        }catch (InvalidCharactersException e) {
            e.printStackTrace();
        }catch (PasswordConfrimationExceptiom e) {
            e.printStackTrace();
        }catch (LengthException e) {
            e.printStackTrace();
        }
    }
    void  vadateRegistration(String login, String password, String confrimPassport)
        throws EmptyLoginException, InvalidCharactersException, PasswordConfrimationExceptiom, LengthException{
        if (login == null || login.trim().length() == 0 || confrimPassport == null || confrimPassport.length() == 0){
            throw new EmptyLoginException("все поля должны быть заполнены");
        }
        if (login.length() > 20 || password.length() > 20 || confrimPassport.length() > 20){
            throw new LengthException("длинна поля должны быть не более 20 символов");
        }
        Pattern pattern =  Pattern.compile("[^a-zA-Z0-1]");
        Matcher matcher = pattern.matcher(login);
        Matcher matcher1 = pattern.matcher(password);
        Matcher matcher2 = pattern.matcher(confrimPassport);
        if (matcher.find() || matcher1.find() || matcher2.find()){
            throw new InvalidCharactersException("Введены недопустимые символы");
        }
        if (!password.equals(confrimPassport)) {
            throw new PasswordConfrimationExceptiom("пароли не совпадают");
        }
    }

}
