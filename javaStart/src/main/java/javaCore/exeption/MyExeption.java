package javaCore.exeption;

public class MyExeption extends RuntimeException{
    String massamge;
    String faleName;

    public MyExeption(String message, String massamge) {
        super(message);
        this.massamge = massamge;
        this.faleName = faleName;
    }
}
