package PATTERN.Behavioral.momento;

public class MomentoExamle {
    public static void main(String[] args) {
        Originator originator =  new Originator();
        originator.setState("one");
        CareTaker careTaker =  new CareTaker();
        careTaker.setMomento(originator.createMomento());
        originator.setState("two");
        originator.getDataForMomento(careTaker.getMomento());
        System.out.println(originator.getState());
    }
}

//хранит моменто
class CareTaker{
    Momento momento;

    public Momento getMomento() {
        return momento;
    }

    public void setMomento(Momento momento) {
        this.momento = momento;
    }
}
// имеет статус и пару методов для создания моменто
class Originator{
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    Momento createMomento(){
         return new  Momento(state);
    }
    void getDataForMomento(Momento momento){
        this.state = momento.getState();
    }
}
// отвечает за статус
class Momento{
    String state;

    public Momento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
