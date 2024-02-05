package javaCore.mnogopotocnost;

public class IsAliveExample {
    public static void main(String[] args) throws InterruptedException {
        RunnableExalmple myRannable = new RunnableExalmple("1");
        Thread thread = new Thread(myRannable);
        System.out.println(thread.isAlive());
        thread.start();
        System.out.println(thread.isAlive());
        thread.join();
        System.out.println(thread.isAlive());

    }
}
