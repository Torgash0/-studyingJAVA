package mapHashCode;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<>();
        states.put(1, "Usa");
        states.put(2, "USSR");
        states.put(4, "Germani");
        states.put(3, "Italy");
        String first = states.get(2);
        System.out.println(first);
        Set<Integer> keys = states.keySet();
        System.out.println(keys);
        Collection<String> values = states.values();
        states.replace(1, "Poland");
        System.out.println(values);
        states.remove(2);
        for (Map.Entry<Integer, String> item : states.entrySet()){
            System.out.printf("key: %d Value: %s \n", item.getKey(), item.getValue());
        }
    }
}
