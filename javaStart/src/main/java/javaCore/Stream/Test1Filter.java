package javaCore.Stream;

import java.util.stream.Stream;

public class Test1Filter {
    public static void main(String[] args) {
            //long res = Stream.of("a1", "a2", "a3").filter("a1"::equals).count();
            long res = Stream.of("a1", "a2", "a3").filter(a -> a.equals("a1")).count();
            System.out.println(res);
    }
}
