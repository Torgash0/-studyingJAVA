package javaCore.Stream.Example.demo5;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static javaCore.Stream.Example.Constants.PATH_TO_DEMO_TXT_FILE;

public class Demo17 {

    public static void main(String[] args) throws IOException {
        final Object[] powers = Stream.iterate(1.0, p -> p * 2)
                .peek(e -> System.out.println("Fetching " + e))
                .limit(20)
                .toArray();
    }
}

