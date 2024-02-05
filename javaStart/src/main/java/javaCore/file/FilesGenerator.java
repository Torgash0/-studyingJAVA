package javaCore.file;

import javax.annotation.processing.Filer;
import javax.swing.text.html.HTMLDocument;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Scanner;

public class FilesGenerator {
    public static void main(String[] args) throws IOException {
        File dir = new File("/Users/gaydaev/IdeaProjects/study/src/main/java/file/dir");
        dir.mkdir();
        for (int i = 0; i < 20; i++) {
            File f = new File(dir, "file_" + i + ".txt");
            f.createNewFile();
            try(OutputStream os = new FileOutputStream(f); BufferedOutputStream bos = new BufferedOutputStream(os)) { //вот строчка с буффером

                bos.write(("java " + i).getBytes());
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
////просто вывод всех названий файлов в директории
//        for(File f :dir.listFiles()){
//            System.out.println(f.getName());
//        }
        for(File f :dir.listFiles()){
            try (FileReader fr = new FileReader(f); Scanner scanner = new Scanner(fr)){
                while (scanner.hasNext()){
                    if (scanner.nextLine().equals("java 7")){
                        System.out.println("я нашел его " + f.getName());
                    }
                }
            }
        }
    }
}
