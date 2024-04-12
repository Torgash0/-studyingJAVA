//пример на синхроггищацию
package javaCore.mnogopotocnost;

public class MyThread implements Runnable {
    private int counter = 0;
    private static int globalcounter = 0;

    @Override
    public void run() {
        while (counter < 20) {
            counter++;
            globalcounter++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " +++ " + counter + " ---- " + globalcounter);
        }

    }

    public static void main(String[] args) {
        new Thread(new MyThread()).start();
        new Thread(new MyThread()).start();
        new Thread(new MyThread()).start();



        var a =  new MyThread();
        Thread thread = new Thread(a);
        thread.start();
    }
}
