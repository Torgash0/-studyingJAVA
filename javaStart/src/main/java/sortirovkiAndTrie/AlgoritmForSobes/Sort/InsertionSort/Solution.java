package sortirovkiAndTrie.AlgoritmForSobes.Sort.InsertionSort;

public class Solution {
    public static void main(String[] args) {
        int[] testArr = new int[]{6, 3, 8, 8, 6, 9, 4, 11, 1};
        insertionSort(testArr);
        for (int i : testArr) {
            System.out.println(i);
        }
    }

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) { // i - разделяющий маркер
            int temp = array[i]; // делаем копию помеченного элемента
            int j = i;
            while (j 	> 0 && array[j - 1] >= temp) { // пока не будет найден меньший элемент
                array[j] = array[j - 1]; // сдвигаем элементы вправо
                --j;
            }
            array[j] = temp;   // вставляем отмеченный элемент, в положеное ему место
        }
    }
}