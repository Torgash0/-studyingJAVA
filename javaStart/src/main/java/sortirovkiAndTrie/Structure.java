package sortirovkiAndTrie;

public class Structure {
    public static void main(String[] args) {
        long n = fac(5);
        System.out.println(n);



    }
    public static long fac(int n){
        long result = 1;
        if(n<2) {
            return result;
        }
        result = n * fac(n-1);
        System.out.println(result);
        return result;
    }
}
