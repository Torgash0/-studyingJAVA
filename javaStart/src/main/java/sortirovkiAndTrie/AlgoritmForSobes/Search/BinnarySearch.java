package sortirovkiAndTrie.AlgoritmForSobes.Search;

public class BinnarySearch {
    public static int BinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Возвращаем индекс найденного элемента
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Возвращаем -1, если элемент не найден
    }
}