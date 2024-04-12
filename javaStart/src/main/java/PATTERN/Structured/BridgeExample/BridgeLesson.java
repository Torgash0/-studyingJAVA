package PATTERN.Structured.BridgeExample;

import javaCore.generic.A;

public class BridgeLesson {
    public static void main(String[] args) {
        ICar car = new ToyotaCar(new CarBridge());
        car.drive();
        ICar car1 =  new AudiCar(new TrackBridge());
        ITrack track = new ToyotaTrack(new TrackBridge());
        track.drive();

    }
}
abstract class  ICar{
    IBridge iBridge;
    public ICar(IBridge iBridge){
        this.iBridge = iBridge;
    }
    public abstract void drive();
}
abstract class ITrack{
    IBridge iBridge;
    public ITrack(IBridge iBridge){
        this.iBridge = iBridge;
    }
    public abstract void drive();
}
interface IBridge{
    void drive();
}
class CarBridge implements IBridge{

    @Override
    public void drive() {
        System.out.println("drive car");
    }
}
class TrackBridge implements IBridge{
    @Override
    public void drive() {
        System.out.println("drive track");

    }
}

class ToyotaCar extends ICar{

    public ToyotaCar(IBridge iBridge) {
        super(iBridge);
    }
    @Override
    public void drive() {
        System.out.println("drive car ToyotaCar");
    }
}
class AudiCar extends ICar{
    public AudiCar(IBridge iBridge) {
        super(iBridge);
    }
    @Override
    public void drive() {
        System.out.println("drive car AudiCar");
    }
}
class ToyotaTrack extends ITrack{
    public ToyotaTrack(IBridge iBridge) {
        super(iBridge);
    }
    @Override
    public void drive() {
        System.out.println("drive car ToyotaTrack");
    }
}
class AudiTrack extends ITrack{
    public AudiTrack(IBridge iBridge) {
        super(iBridge);
    }
    @Override
    public void drive() {
        System.out.println("drive car AudiTrack");
    }
}