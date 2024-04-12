package javaCore.mnogopotocnost.Asinhron;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;

public class Acinhronnost {
    static CountDownLatch latch1 = new CountDownLatch(1);
    static CountDownLatch latch2 = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("1");
        System.out.println("2");
        new Acinhronnost().IO1("чтение");
        latch1.await();
        System.out.println("4");
        new Acinhronnost().IO2("запись");
        latch2.await();
        System.out.println("конец");
    }
     void IO1(String word){
        latch1.countDown();
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         System.out.println(word);
     }
    void IO2(String word){
        latch2.countDown();
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(word);
    }
}

