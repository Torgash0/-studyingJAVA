package javaCore.Stream.Example.demo6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static javaCore.Stream.Example.Constants.PATH_TO_DEMO_TXT_FILE;

public class Demo20 {

    public static void main(String[] args) throws IOException {
        //Считываем данные из файла
        byte[] bytes = Files.readAllBytes(Paths.get(PATH_TO_DEMO_TXT_FILE));

        //Преобразуем текст из файла в символьную строку
        String contents = new String(bytes, StandardCharsets.UTF_8);

        //Выделяем из всего файла - список слов
        List<String> words = Arrays.asList(contents.split("\\PL+"));

        //Если требуется любое совпадание, а не только первое, то следует воспользоваться
        //методом findAny(). Это оказывается эффективным при распараллеливании потока данных
        final Optional<String> startWithQ = words
                .stream()
                .filter(s -> s.startsWith("Q"))
                .findAny();
    }

    



}

