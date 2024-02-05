package javaCore.Enum;

public class Pair<K, V> {
    private K key;
    private V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public static void main(String[] args) {
        Pair<Day, Integer>[] schelduler = new   Pair[4];
        schelduler[0] = new Pair<>(Day.mnd, 4);
        schelduler[1] = new Pair<>(Day.thsd, Day.thsd.getWorkingHouer());
        schelduler[2] = new Pair<>(Day.frd, 0);
        schelduler[3] = new Pair<>(Day.snd, 8);
        for (Pair p : schelduler){
            System.out.println(p.key + " " + p.value + " " + ((Day)p.key).getWorkingHouer());
        }
    }
}

