package javaCore.Stream.Example.demo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static javaCore.Stream.Example.Constants.PATH_TO_DEMO_TXT_FILE;

public class Demo6 {
    public static void main(String[] args) throws IOException {
        try(Stream<String> lines = Files.lines(Paths.get(PATH_TO_DEMO_TXT_FILE))){
            //обработать строки
        }
    }
}
