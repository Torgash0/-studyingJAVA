package PATTERN.Crearional.ObjectPollExample;

import javax.print.attribute.standard.JobKOctets;
import java.util.LinkedList;
import java.util.List;

public class ObjectPoolLesson {
    public static void main(String[] args) {
        ObjectPoll objectPoll = new ObjectPoll();
        Poledlobject poledlobject = objectPoll.getPolledObject();
        objectPoll.releasePolledobject(poledlobject);
    }
}
class Poledlobject{}
class ObjectPoll{
    List<Poledlobject> free =  new LinkedList<>();
    List<Poledlobject> used =  new LinkedList<>();
    public Poledlobject getPolledObject(){
        if (free.isEmpty()){
            Poledlobject poledlobject = new Poledlobject();
            free.add(poledlobject);
            return poledlobject;
        }
        else {
            Poledlobject poledlobject = free.getFirst();
            used.add(poledlobject);
            free.remove(poledlobject);
            return poledlobject;
        }
    }
    public void releasePolledobject(Poledlobject poledlobject){
        used.remove(poledlobject);
        free.add(poledlobject);
    }
}