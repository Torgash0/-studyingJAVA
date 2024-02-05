package sortirovkiAndTrie;

import java.util.Scanner;

public class Sortirovki {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        bubleSort(arr);
//        viborSort(arr);
//        vstakaSort(arr);
//        fastHoaraSort(arr);
//        lamutoSort(arr);
        int[] arr = new int[]{1,2,5,50,100};
        viborSort(arr);
//        System.out.println(binarySearch(50, array));

    }


    //пузырьком
    static void bubleSort(int[] arr) {
        int lenght = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        while (lenght != 0) {
            int max_index = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    max_index = i;
                }
            }
            lenght = max_index;
        }
    }


    //сортировка выбором
    static void viborSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = 0; i < arr.length; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            if (min_index != 0) {
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(arr);
    }




    //сортировка вставкой
    static void vstakaSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int sorted = i - 1;
            while (sorted > -1 && arr[sorted] > arr[sorted + 1]) {
                int temp = arr[sorted];
                arr[sorted] = arr[sorted + 1];
                arr[sorted + 1] = temp;
                sorted--;
            }
        }
    }


    //сортировка вставкой
    static int fastSort(int arr[], int left, int right) {
        int pivot = arr[(left + right) / 2];
        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return (left);
    }

    static void fastHoaraSort(int arr[], int start, int end) {
        if (start >= end) return;
        int rightStart = fastSort(arr, start, end);
        fastHoaraSort(arr, start, rightStart - 1);
        fastHoaraSort(arr, rightStart, end);
    }

    static void fastHoaraSort(int arr[]) {
        fastHoaraSort(arr, 0, arr.length - 1);
    }


    //сортировка ЛАМУТА
    static int lamutoOfSort(int arr[], int start, int end) {
        int left = start;
        for (int current = start; current < end; current++) {
            if (arr[current] <= arr[end]) {
                int temp = arr[left];
                arr[current] = temp;
                left++;
            }
        }
        int temp = arr[left];
        arr[left] = arr[end];
        arr[end] = temp;
        return left;
    }

    static void lamutoSort(int arr[], int start, int end) {
        if (start >= end) return;
        int rightStart = lamutoOfSort(arr, start, end);
        lamutoSort(arr, start, rightStart);
        lamutoSort(arr, rightStart, end);
    }

    static void lamutoSort(int arr[]) {

        lamutoSort(arr, 0, arr.length - 1);
    }





//бинарная сортировка
    static int binarySearch(int value, int[] array) {
        int lowIndex = 0;
        int hightIndex = array.length - 1;
        while (lowIndex <= hightIndex) {
            int middleIndex = (lowIndex + hightIndex) / 2;
            if (array[middleIndex] == value) {
                return middleIndex;
            }
            if (array[middleIndex] >  value) {
                hightIndex = middleIndex - 1;
            }
            if (array[middleIndex] < value) {
                lowIndex = middleIndex + 1;
            }
        }
        return -1;
    }

}
