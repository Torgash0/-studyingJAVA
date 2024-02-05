package javaCore.generic.Primer;

public class main {
    public static void main(String[] args) {
        Example<Car, String> example = new Example<>();
        String s =  "абоба ";
        Car car1 = new Car("Bmw", 10);
        Car car2 = new Car("Audi", 5);
        Car car3 = new Car("Subaru", 20);
        example.add(car1, s);
        example.add(car2, s);
        example.add(car3, s);
        System.out.println(example.getString());
    }

}
