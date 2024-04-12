package PATTERN.Crearional.Singelron1;

public class SingeltonLesson {
    public static void main(String[] args) {
        Singelton singelton = Singelton.getInstance();
        singelton.i = 5;
        System.out.println(singelton.i);

    }
}
class Singelton{
    int i;
    static Singelton singelton = new Singelton();
    private Singelton(){
    }
    public static Singelton getInstance(){
        return singelton;

    }
}
