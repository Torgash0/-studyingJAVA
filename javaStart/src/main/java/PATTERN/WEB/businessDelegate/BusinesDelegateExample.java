package PATTERN.WEB.businessDelegate;

public class BusinesDelegateExample {
    public static void main(String[] args) {
        BusinessDelega businessDelega =  new BusinessDelega();
        businessDelega.doTask("ejb");
    }
}
class LookupService {
    BudinessService getService(String serviceType){
        if (serviceType.equals("ejb")){
            return new EJBSetrvice();
        }else{
            return new JMSService();
        }
    }
}
class BusinessDelega{
    LookupService lookupService =  new LookupService();
    BudinessService budinessService;
    void doTask(String serviceType){
        budinessService = lookupService.getService(serviceType);
        budinessService.doJob();
    }
}
interface BudinessService{
    void doJob();
}
class EJBSetrvice implements BudinessService{
    @Override
    public void doJob() {
        System.out.println("do ejb job");
    }
}

class JMSService implements BudinessService{
    @Override
    public void doJob() {
        System.out.println("do jms job");
    }
}