package javaCore.Stream.Example.demo1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static javaCore.Stream.Example.Constants.PATH_TO_DEMO_TXT_FILE;

/**
 * Нам нужно подсчитать все длинные слова в книге
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //Считываем данные из файла
        byte[] bytes = Files.readAllBytes(Paths.get(PATH_TO_DEMO_TXT_FILE));

        //Преобразуем текст из файла в символьную строку
        String contents = new String(bytes, StandardCharsets.UTF_8);

        //Выделяем из всего файла - список слов
        List<String> words = Arrays.asList(contents.split("\\PL+"));

        //Осуществляем преобразования с помощью потоков данных
        final long count = words.stream()
                .filter(w -> w.length() > 12)
                .count();

        // System.out.println(count);
    }
}
