package mapHashCode;

import java.util.*;

public class DublicateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(20);
        }
        Map<Integer, Integer> dubicateMap = new HashMap<>();
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            if (dubicateMap.containsKey(i)) {
                int dublicateCount = dubicateMap.get(i);
                dubicateMap.put(i, ++dublicateCount);
            } else {
                dubicateMap.put(i, 0);

            }
        }
        System.out.println(dubicateMap);
        for (int i = 0; i < size; i++) {

        }
    }
}
