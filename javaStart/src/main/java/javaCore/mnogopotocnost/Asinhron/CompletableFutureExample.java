package javaCore.mnogopotocnost.Asinhron;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {
        CompletableFuture<Integer> futureResult = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000); // имитация длительной операции
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 42;
        });

        System.out.println("Основной поток продолжает работу...");

        futureResult.thenAccept(result -> System.out.println("Результат выполнения: " + result));
    }
}