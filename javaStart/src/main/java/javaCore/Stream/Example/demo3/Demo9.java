package javaCore.Stream.Example.demo3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static javaCore.Stream.Example.Constants.PATH_TO_DEMO_TXT_FILE;

public class Demo9 {

    public static void main(String[] args) throws IOException {

        //Считываем данные из файла
        byte[] bytes = Files.readAllBytes(Paths.get(PATH_TO_DEMO_TXT_FILE));

        //Преобразуем текст из файла в символьную строку
        String contents = new String(bytes, StandardCharsets.UTF_8);

        //Выделяем из всего файла - список слов
        List<String> words = Arrays.asList(contents.split("\\PL+"));

        //Полученный поток содержит первую букву каждого слова
        final Stream<String> firstLetters = words
                .stream()
                .map(s -> s.substring(0, 1)); //здесь передаем лямбду

    }


}
