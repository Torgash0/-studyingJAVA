package sortirovkiAndTrie.AlgoritmForSobes.Search;

public class MinArraySearch {
    public static void main(String[] args) {
        int[] array =  new int[] {11, 22, 12,42, 5,11,10};
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++){
            if(array[i] < minValue){
                minValue =  array[i];
                minIndex = i;
            }
        }
        System.out.println("min value " + minValue);
        System.out.println("min index " + minIndex);
    }
}
