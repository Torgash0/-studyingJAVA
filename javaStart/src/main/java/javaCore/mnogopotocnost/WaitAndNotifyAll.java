package javaCore.mnogopotocnost;

import java.util.LinkedList;
import java.util.Queue;

public class WaitAndNotifyAll {
    public static void main(String[] args) {
        MessageQueue queue = new MessageQueue();

        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                String message = "Message " + i;
                queue.produce(message);
                System.out.println("Produced: " + message);
                try {
                    Thread.sleep(100); // задержка между отправкой сообщений
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumerThread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                String message = queue.consume();
                System.out.println("Consumed by Thread 1: " + message);
                try {
                    Thread.sleep(200); // задержка между получением сообщений
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumerThread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                String message = queue.consume();
                System.out.println("Consumed by Thread 2: " + message);
                try {
                    Thread.sleep(200); // задержка между получением сообщений
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();
    }
}
class MessageQueue {
    private Queue<String> queue = new LinkedList<>();

    public synchronized void produce(String message) {
        while (queue.size() >= 10) {
            try {
                wait(); // ждем, пока не освободится место в очереди
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.offer(message);
        notifyAll(); // оповещаем все потоки, что добавили сообщение в очередь
    }

    public synchronized String consume() {
        while (queue.isEmpty()) {
            try {
                wait(); // ждем, пока не появится новое сообщение в очереди
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String message = queue.poll();
        notifyAll(); // оповещаем все потоки, что забрали сообщение из очереди
        return message;
    }
}


//В этом примере класс MessageQueue представляет собой очередь сообщений, которую можно использовать для передачи данных между потоками. Метод produce добавляет новое сообщение в очередь, а метод consume забирает первое сообщение из очереди.
//
//Когда очередь заполнена (более 10 сообщений), поток, вызывающий метод produce, будет ждать, пока не освободится место в очереди. Он вызывает метод wait, который освобождает монитор объекта MessageQueue и ожидает, пока другой поток не вызовет метод notifyAll.
//
//Когда в очереди появляется новое сообщение, поток, вызывающий метод consume, будет ждать, пока в очереди не появится новое сообщение. Он вызывает метод wait, который освобождает монитор объекта MessageQueue и ожидает, пока другой поток не вызовет метод notifyAll.
//
//Когда новое сообщение добавляется в очередь или старое сообщение забирается из очереди, вызывается метод notifyAll, который оповещает все потоки, ожидающие монитор объекта MessageQueue, что произошли изменения в очереди. Это позволяет потокам продолжить выполнение своей работы.