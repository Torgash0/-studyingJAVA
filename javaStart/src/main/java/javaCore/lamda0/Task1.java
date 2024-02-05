package javaCore.lamda0;

public class Task1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello mutherFucker!");
            }
        });
        Thread thread1 = new Thread(() -> System.out.println("hey"));
        thread.start();
        thread1.start();

    }
}
