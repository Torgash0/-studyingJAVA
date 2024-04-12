package PATTERN.Behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverExample {
    public static void main(String[] args) {
        Observer observer1 = new Observer("one");
        Observer observer2 = new Observer("two");
        observer1.setState("new state");
        observer2.setState("Hello");
    }
}
interface Observable{
    void update();
}
class Observer implements Observable{
    static List<Observer> observers = new ArrayList<>();
    String name;
    String state;

    public Observer(String name) {
        this.name = name;
        observers.add(this);
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObswervers();
    }

    void notifyAllObswervers() {
        for (Observer o :observers){
            o.update();
        }
    }
    @Override
    public void update() {
        System.out.println(name + " change status: " + state);
    }
}

