package PATTERN.Structured.Filterexample;

import java.util.ArrayList;
import java.util.List;

public class FilterLesson {
    public static void main(String[] args) {
        CarF carF = new CarF(160, 3,"black");
        CarF carF1 = new CarF(200, 5,"res");
        CarF carF2 = new CarF(290, 2,"grenn");
        List<CarF> cars = new ArrayList<>();
        cars.add(carF1);
        cars.add(carF2);
        cars.add(carF);
        //cars = new SpeedFilter().filter(cars);
        AndFilter andFilter =  new AndFilter(new SpeedFilter(), new DoorsFilter());
        cars =  andFilter.filter(cars);
        for (CarF car : cars){
            System.out.println(car.toString());
        }


    }
}
interface CarFilter{
    List<CarF> filter(List<CarF> cars);
}
class SpeedFilter implements CarFilter{
    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> list = new ArrayList<>();
        for (CarF car : cars){
            if (car.getMaxSpeed() >190)
            {
                list.add(car);
            }
        }
        return list;
    }
}
class DoorsFilter implements CarFilter{
    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> list = new ArrayList<>();
        for (CarF car : cars){
            if (car.getDoors() >2)
            {
                list.add(car);
            }
        }
        return list;
    }
}
class AndFilter implements CarFilter{
    CarFilter filterOne;
    CarFilter filterTwo;

    public AndFilter(CarFilter filterOne, CarFilter filterTwo) {
        this.filterOne = filterOne;
        this.filterTwo = filterTwo;
    }

    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> list = filterOne.filter(cars);
        return filterTwo.filter(list);
    }
}
class OrFilter implements CarFilter{
    CarFilter filterOne;
    CarFilter filterTwo;

    public OrFilter(CarFilter filterOne, CarFilter filterTwo) {
        this.filterOne = filterOne;
        this.filterTwo = filterTwo;
    }

    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> list1 = filterOne.filter(cars);
        List<CarF> list2 = filterTwo.filter(cars);
        for (CarF car : list2){
            if(!list1.contains(car)){
                list1.add(car);
            }
        }
        return list1;
    }
}
class CarF{
    private int MaxSpeed;
    private int doors;
    private String colot;

    @Override
    public String toString() {
        return "CarF{" +
                "MaxSpeed=" + MaxSpeed +
                ", doors=" + doors +
                ", colot='" + colot + '\'' +
                '}';
    }

    public CarF(int maxSpees, int doors, String colot) {
        MaxSpeed = maxSpees;
        this.doors = doors;
        this.colot = colot;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColot() {
        return colot;
    }

    public void setColot(String colot) {
        this.colot = colot;
    }
}
