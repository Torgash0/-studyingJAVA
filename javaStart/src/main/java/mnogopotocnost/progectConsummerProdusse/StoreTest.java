package mnogopotocnost.progectConsummerProdusse;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        Produsser produsser = new Produsser(store);
        Consumer consumer = new Consumer(store);
        new Thread(produsser).start();
        new Thread(consumer).start();

    }
}
