package javaCore.exeption;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//java исключение //

//public class TestFor {
//    public static void main(String[] args) throws IOException {
//        readFile();
//    }
//
////    public static void readFile() {
////        try {
////            BufferedReader fin = new BufferedReader(new FileReader("/Users/gaydaev/IdeaProjects/study/src/main/java/org/example/Main.java"));
////            String line;
////            while ((line = fin.readLine()) != null) System.out.println(line);
////        } catch (FileNotFoundException e) {
////            throw new RuntimeException(e);
////        } catch (IOException e) {
////            throw new RuntimeException(e);
////        }
////    }
//
//    public static void readFile() throws IOException {
//
//            BufferedReader fin = new BufferedReader(new FileReader("/Users/gaydaev/IdeaProjects/study/src/main/java/org/example/Main.java"));
//            String line;
//            while ((line = fin.readLine()) != null) System.out.println(line);
//    }
//}





// с своим исключением //
public class TestFor {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try {
            BufferedReader fin = new BufferedReader(new FileReader("/Users/gaydaev/IdeaProjects/study/src/main/java/org/example/Main.java"));
            String line;
            while ((line = fin.readLine()) != null) System.out.println(line);
        } catch (IOException e) {
            throw new MyExeption("на выходе путь укан не верно ", "/Users/gaydaev/IdeaProjects/study/src/main/java/org/example/Main.java");
        }
    }

//    public static void readFile() throws IOException {
//
//        BufferedReader fin = new BufferedReader(new FileReader("/Users/gaydaev/IdeaProjects/study/src/main/java/org/example/Main.java"));
//        String line;
//        while ((line = fin.readLine()) != null) System.out.println(line);
//    }
}