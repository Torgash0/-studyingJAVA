package PATTERN.WEB.compositeentity;

public class CompositeEntityExaple {
    public static void main(String[] args) {
        CompositeEntity compositeEntity = new CompositeEntity();
        for(String s : compositeEntity.getData()) {
            System.out.println(s);
        }
    }
}

class CompositeEntity{ // через него вызывем
    CoarseGainObkect coarseGainObkect = new CoarseGainObkect();
    public String[] getData(){
        return coarseGainObkect.getData();
    }
}

class CoarseGainObkect{ //через него дергаем
    DependentObkectOne dependentObkectOne = new DependentObkectOne();
    DependentObkectTwo dependentObkectTwo = new DependentObkectTwo();
    DependentObkectThree dependentObkectThree = new DependentObkectThree();
    public String[] getData(){
        return new String[] { dependentObkectOne.getData(), dependentObkectTwo.getData(), dependentObkectThree.getData()};
    }
}
class DependentObkectOne{
    String getData(){
        return "one";
    }
}
class DependentObkectTwo{
    String getData(){
        return "two";
    }
}
class DependentObkectThree{
    String getData(){
        return "three";
    }
}
