package PATTERN.Behavioral.mediator;


import javaCore.generic.C;

import java.util.ArrayList;
import java.util.List;

public class MediatorExample {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator =  new ConcreteMediator();
        concreteMediator.add(new ConcreteColegue(concreteMediator, "1"));
        concreteMediator.add(new ConcreteColegue(concreteMediator, "2"));
        concreteMediator.add(new ConcreteColegue(concreteMediator, "3"));
        concreteMediator.add(new ConcreteColegue(concreteMediator, "4"));
        ConcreteColegue concreteColegue = new ConcreteColegue(concreteMediator, "5");
        concreteMediator.add(concreteColegue);
        concreteColegue.changeStatus();

    }
}
interface Mediator{
    void requestAll(Collegue collegue);
}
class ConcreteMediator implements Mediator{
    List<Collegue> collegues =  new ArrayList<>();
    void add(Collegue collegue){
        collegues.add(collegue);
    }
    @Override
    public void requestAll(Collegue collegue) {
        collegue.setTrue();
        for (Collegue coll : collegues){
            if(coll != collegue) {
                coll.setFalse();
            }
        }
    }

}
interface Collegue{
    void setFalse();
    void setTrue();
    void changeStatus();

}
class ConcreteColegue implements Collegue{
    boolean status;
    Mediator mediator;
    String name;

    public ConcreteColegue(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void setFalse() {
        status = false;
        System.out.println("Status is False " +  name);
    }

    @Override
    public void setTrue() {
        status = true;
        System.out.println("Status is True " +  name);
    }

    @Override
    public void changeStatus() {
        mediator.requestAll(this);

    }
}

