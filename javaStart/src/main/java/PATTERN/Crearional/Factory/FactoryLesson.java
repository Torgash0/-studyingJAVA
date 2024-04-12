package PATTERN.Crearional.Factory;

public class FactoryLesson {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car car  =  factory.create("Audi");
        Car car1 = factory.create("Toyota");
        car1.drive();
        car.drive();


    }
}

