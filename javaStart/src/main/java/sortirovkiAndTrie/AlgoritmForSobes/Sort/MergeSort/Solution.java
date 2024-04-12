package sortirovkiAndTrie.AlgoritmForSobes.Sort.MergeSort;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] testArr = new int[]{6, 3, 8, 8, 6, 9, 4, 11, 1};
        testArr = mergeSort(testArr);
        for (int i : testArr) {
            System.out.println(i);
        }
    }

    public static int[] mergeSort(int[] array1) {
        int[] sortArr = Arrays.copyOf(array1, array1.length);// массив для сортировки
        int[] bufferArr = new int[array1.length];// буферный массив
        return recurtionMergeSort(sortArr, bufferArr, 0, array1.length);
    }


    public static int[] recurtionMergeSort(int[] sortArr, int[] bufferArr,
                                           int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {// выход из массива, когда в рассматриваемом промежутке массива, только один элемент
            return sortArr;
        }

        // запускаем рекурсию, чтобы получить два отсортированных массива:
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] firstSortArr = recurtionMergeSort(sortArr, bufferArr, startIndex, middle);
        int[] secondSortArr = recurtionMergeSort(sortArr, bufferArr, middle, endIndex);

        // Слияние отсортированных массивов:
        int firstIndex = startIndex;
        int secondIndex = middle;
        int destIndex = startIndex;
        int[] result = firstSortArr == sortArr ? bufferArr : sortArr;
        while (firstIndex < middle && secondIndex < endIndex) {
            result[destIndex++] = firstSortArr[firstIndex] < secondSortArr[secondIndex]
                    ? firstSortArr[firstIndex++] : secondSortArr[secondIndex++];
        }
        while (firstIndex < middle) {
            result[destIndex++] = firstSortArr[firstIndex++];
        }
        while (secondIndex < endIndex) {
            result[destIndex++] = secondSortArr[secondIndex++];
        }
        return result;
    }
}