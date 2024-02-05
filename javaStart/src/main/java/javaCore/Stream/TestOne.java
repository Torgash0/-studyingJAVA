package javaCore.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TestOne {
    public static void main(String[] args) {
        Collection collection = Arrays.asList("a1", "a2", "a3", "a1");
        System.out.println(collection.stream().filter("a1"::equals).count());
        System.out.println(collection.stream().findFirst().orElse("0"));
        System.out.println(collection.stream().skip(collection.size() - 1).findFirst().orElse("0"));
        System.out.println(collection.stream().filter("a3"::equals).findFirst().get());
        System.out.println(collection.stream().skip(2).findFirst().get());
        System.out.println(collection.stream().skip(1).limit(2).collect(Collectors.toList()));

    }
}
