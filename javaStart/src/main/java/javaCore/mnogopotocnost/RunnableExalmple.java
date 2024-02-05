package javaCore.mnogopotocnost;

public class RunnableExalmple  implements Runnable{
    private String localName;
    public RunnableExalmple(String localName) {
        this.localName = localName;
    }

    @Override
    public void run() {
        System.out.println(localName);
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableExalmple("1"));
        Thread thread2 = new Thread(new RunnableExalmple("2"));
        Thread thread3 = new Thread(new RunnableExalmple("3"));
        Thread thread4 = new Thread(new RunnableExalmple("4"));
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(10);
        thread3.setPriority(8);
        thread4.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
