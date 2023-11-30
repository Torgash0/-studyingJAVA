package mnogopotocnost.progectConsummerProdusse;

public class Produsser  implements  Runnable{
    private Store store;

    public Produsser(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++){
            store.put();
        }
    }
}
