package mnogopotocnost;

public class JoinRunnable extends Thread {
    public JoinRunnable(String name) {
        super(name);
    }

    @Override
    public void run() {
        String currentTreadName = TreadExamle.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(currentTreadName + i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(currentTreadName);
    }

    public static void main(String[] args) {
        JoinRunnable a = new JoinRunnable("A");
        JoinRunnable b = new JoinRunnable("B");
        JoinRunnable c = new JoinRunnable("C");
        a.start();
        try {
            a.join();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        b.start();
        c.start();
    }
}
