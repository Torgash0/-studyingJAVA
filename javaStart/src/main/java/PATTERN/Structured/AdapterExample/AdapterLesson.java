package PATTERN.Structured.AdapterExample;

public class AdapterLesson {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        carWash.washCar(new Audi());
        carWash.washCar(new TrackWrap(new MyTrack()));

    }
}

interface Track{
    void clean();
}
class MyTrack implements Track{
    @Override
    public void clean() {
        System.out.println("Track is clean");
    }
}

// это и есть адаптер
class TrackWrap implements Car{
    Track track;
    public TrackWrap(Track track) {
        this.track = track;
    }

    @Override
    public void wash() {
        track.clean();
    }
}
interface Car{
    void wash();
}
class Audi implements Car{
    @Override
    public void wash() {
        System.out.println("wash Car");
    }
}
class CarWash{
    public void washCar(Car car){
        car.wash();
    }
}
