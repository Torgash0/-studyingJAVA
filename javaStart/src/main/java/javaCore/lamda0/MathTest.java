package javaCore.lamda0;

public class MathTest {
    interface MathInterface<T>{
        T getMax(T first, T next);
    }
    static void print(MathInterface m){

        System.out.println(m.getMax(234, 35));
    }

    public static void main(String[] args) {
//        MathInterface m = new MathInterface<Integer>() {
//            @Override
//            public Integer getMax(Integer first, Integer second) {
//                if(first > second)
//                    return first;
//                return second;
//            }
//        };

        //а это уже с lamda
        MathInterface<Integer> m = (x, y) -> x > y ? x : y;
        print(m);



    }
}
