package mnogopotocnost.pullPotokovAlterntiva;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class LockExample {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        ReentrantLock locker = new ReentrantLock();
        for (int i = 0; i < 6; i++) {
            Thread t = new Thread(new CountThread(commonResource, locker));
            t.setName("Thread " + i);
            t.start();
        }


    }
}
class CommonResource {
    int x = 0 ;
}
class CountThread implements Runnable{
    CommonResource res;
    ReentrantLock locler;

    public CountThread(CommonResource res, ReentrantLock locler) {
        this.res = res;
        this.locler = locler;
    }


    @Override
    public void run() {
        //locler.tryLock(); оно не работает здесь
        locler.lock();
        try {
            res.x = 1;
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            locler.unlock();
        }

    }
}

