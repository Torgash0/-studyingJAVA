package javaCore.mnogopotocnost.pullPotokovAlterntiva;

public class DeadLock {
    static  class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public synchronized  void bow (Friend bower){
            System.out.println(this.name + bower.getName());
            bower.bowBack(this);
        }
        public synchronized  void bowBack (Friend bower){
            System.out.println(this.name + bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend alphonse = new Friend("Alphonse");
        final Friend gaston = new Friend("Gaston");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
                alphonse.bow(gaston);
                System.out.println("th: gaston ");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2");
                gaston.bow(alphonse);
                System.out.println("th: alphonse ");
            }
        }).start();
    }
}
