package javaCore.Stream.Example.demo1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;

import static javaCore.Stream.Example.Constants.PATH_TO_DEMO_TXT_FILE;

/**
 * Нам нужно подсчитать все длинные слова в книге
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //Считываем данные из файла
        byte[] bytes = Files.readAllBytes(Paths.get(PATH_TO_DEMO_TXT_FILE));

        //Преобразуем текст из файла в символьную строку
        String contents = new String(bytes, StandardCharsets.UTF_8);

        //Выделяем из всего файла - список слов
        String[] words = contents.split("\\PL+");

        //Выполняем подсчет количества слов
        int count = 0;
        for (String w : words) {
            if (w.length() > 12) {//считаем слово длинным, если length > 12
                count++;
            }
        }

      //  Collection

        System.out.println(count);
    }
}
