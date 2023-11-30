package mnogopotocnost.progectConsummerProdusse;

public class Store {
    private int item;

    public synchronized void put() {
        while (item >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        item++;
        System.out.println("добавил " + item);
        notify();
    }

    public synchronized void get() {

        while (item < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        item--;
        System.out.println("купил " + item);
        notify();
    }
}
