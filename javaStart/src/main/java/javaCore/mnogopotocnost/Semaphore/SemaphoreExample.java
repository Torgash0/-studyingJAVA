package javaCore.mnogopotocnost.Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private static final int MAX_THREADS = 2;
    private static final Semaphore SEMAPHORE = new Semaphore(MAX_THREADS);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Task());
            thread.start();
        }
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            try {
                SEMAPHORE.acquire();
                System.out.println("Thread " + Thread.currentThread().getName() + " acquired the semaphore");
                Thread.sleep(1000);
                SEMAPHORE.release();
                System.out.println("Thread " + Thread.currentThread().getName() + " released the semaphore");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}