package PATTERN.Structured.proxy;

public class Proxy {
    public static void main(String[] args) {
        CarI carI = new CarProxy();
        carI.drive();

    }
}
interface CarI{
    void drive();
}
class CarProxy implements CarI{
    CarI carI = new Reno();

    @Override
    public void drive() {
        System.out.println("proxy code");
        carI.drive();


    }
}
class Reno implements CarI{
    @Override
    public void drive() {
        System.out.println("drive reno");
    }
}