//пример на синхроггищацию
package mnogopotocnost;

public class MyThread implements Runnable {
    private int counter;
    private static int globalcounter;

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
            System.out.println(Thread.currentThread().getName() + "+++" + counter + " ----" + globalcounter);
        }

    }

    public static void main(String[] args) {
        new Thread(new MyThread()).start();
        new Thread(new MyThread()).start();
        new Thread(new MyThread()).start();
    }
}
