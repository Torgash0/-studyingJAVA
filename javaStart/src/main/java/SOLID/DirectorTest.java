package SOLID;

public class DirectorTest {
    public static void main(String[] args) {
        Director director = Director.getInstance("123");
        director.sign();

        Director directo1r = Director.getInstance("1");
        directo1r.sign();

    }
}
