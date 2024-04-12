package javaCore.lamda0;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LamdaListTest {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        int arraySize = random.nextInt(30);
        for (int i = 0; i < arraySize; i++) {
            integerList.add(random.nextInt(100));
        }
        System.out.println(integerList);
        action(integerList);
        System.out.println(action(integerList).execute(integerList));
    }

    interface Operation<V, T> {
        V execute(T t);
    }

    public static Operation action(List<Integer> list) {
        if (list.size() > 20) {
            Operation<Integer, List<Integer>> operation = l -> {
                int sum = 0;
                for (int i : l)
                    sum = sum + i;
                    return sum;
            };
            return operation;
        } else if (list.size() > 10) {
            Operation<String, List<Integer>> operation = l -> {
                String result = "";
                for (int i : l)
                    result = result + i;
                    return result;
            };
            return operation;
        } else {
            Operation<Integer, List<Integer>> operation = l -> {
                int result = 0;
                for (int i : l)
                    result = result * i;
                    return result;
            };
            return operation;
        }
    }
}