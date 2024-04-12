package sortirovkiAndTrie.AlgoritmForSobes.Sort.SortBySelect;

public class Solution {
    public static void main(String[] args) {
        int[] testArr = new int[]{6, 3, 8, 2, 6, 9, 4, 11, 1};
        sortBySelect(testArr);
        for (int i : testArr) {
            System.out.println(i);
        }
    }

    public static void sortBySelect(int[] array) {

        for (int i = 0; i < array.length-1; i++) { // внешний обычный  цикл
            int min = i;

            for (int j = i + 1; j < array.length; j++) { // обычный цикл, но с отчетом с сортированных чисел
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];     // вставка отссортиованного числа, в положеную ему ячейку
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
