package javaCore.mnogopotocnost.Asinhron;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncExample {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> futureResult = executor.submit(() -> {
            Thread.sleep(2000); // имитация длительной операции
            return 42;
        });

        System.out.println("Основной поток продолжает работу...");

        try {
            int result = futureResult.get();
            System.out.println("Результат выполнения: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}