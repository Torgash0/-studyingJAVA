package javaCore.mnogopotocnost.progectConsummerProdusse;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        Produsser produsser = new Produsser(store);
        Consumer consumer = new Consumer(store);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(produsser);
        executorService.execute(consumer);
        executorService.shutdown();
//        new Thread(produsser).start();
//        new Thread(consumer).start();

    }
}
