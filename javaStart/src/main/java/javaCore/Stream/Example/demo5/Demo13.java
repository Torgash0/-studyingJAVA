package javaCore.Stream.Example.demo5;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static javaCore.Stream.Example.Constants.PATH_TO_DEMO_TXT_FILE;

public class Demo13 {

    public static void main(String[] args) throws IOException {
        //Считываем данные из файла
        byte[] bytes = Files.readAllBytes(Paths.get(PATH_TO_DEMO_TXT_FILE));

        //Преобразуем текст из файла в символьную строку
        String contents = new String(bytes, StandardCharsets.UTF_8);

        //Выделяем из всего файла - список слов и пропуск первой пустой строки
        final Stream<String> skip = Stream.of(contents.split("\\PL+")).skip(1);

    }
}
