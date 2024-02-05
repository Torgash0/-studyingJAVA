package javaCore.generic.Primer;

public class Car {
    private String model;
    private int age;


    public Car(String model, int age) {
        this.model = model;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", age=" + age +
                '}';
    }

}
