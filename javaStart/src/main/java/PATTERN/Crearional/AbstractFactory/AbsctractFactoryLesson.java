package PATTERN.Crearional.AbstractFactory;

public class AbsctractFactoryLesson {
    public static void main(String[] args) {
        Factory1 CarFactory1 = new AbstractFactory().createFactory("Car");
        Factory1 TankFactory1 = new AbstractFactory().createFactory("Tank");
        Car Toyota = CarFactory1.createCar("Toyota");
        Tank T51 =  TankFactory1.createTank("T51");
        T51.drive();
        Toyota.drive();

    }
}

interface Car {
    void drive();
}

interface Tank {
    void drive();
}

class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("AUDI");
    }
}
class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("Toyota");
    }
}

class T51 implements Tank {
    @Override
    public void drive() {
        System.out.println("T51");
    }
}
class T52 implements Tank{
    @Override
    public void drive() {
        System.out.println("T52");
    }
}
class CarFactory implements  Factory1{
    public Car createCar(String typeOfCar){
        switch (typeOfCar){
            case "Toyota" : return new Toyota();
            case "Audi" : return new Audi();
            default: return null;
        }
    }

    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}
class TankFactory implements Factory1{
    public Tank createTank(String typeOfTank){
        switch (typeOfTank){
            case "T51" : return new T51();
            case "Audi" : return new T52();
            default: return null;
        }
    }

    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }
}
interface Factory1{
    public Car createCar(String typeOfCar);
    public Tank createTank(String typeOfTank);


}
class AbstractFactory{
    Factory1 createFactory(String typeOfFactory){
        switch (typeOfFactory){
            case "Tank" : return new TankFactory();
            case "Car" : return new CarFactory();
            default: return null;
        }
    }

}

