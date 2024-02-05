package javaCore.mnogopotocnost;

public class SleepExample implements Runnable {
    @Override
    public void run() {
        for (int x = 1; x < 4; x++) {
            System.out.println(Thread.currentThread().getName() + x );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        SleepExample sleepExample = new SleepExample();
        Thread one = new Thread(sleepExample);
        one.setName("Fred");
        Thread two = new Thread(sleepExample);
        two.setName("Fr");
        Thread tree = new Thread(sleepExample);
        tree.setName("f");
        one.start();
        two.start();
        tree.start();


    }
}
