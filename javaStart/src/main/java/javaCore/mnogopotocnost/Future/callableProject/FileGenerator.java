package javaCore.mnogopotocnost.Future.callableProject;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;
import java.util.concurrent.*;

public class FileGenerator implements Callable {
    @Override
    public List<String> call() throws Exception {
        String threadName = Thread.currentThread().getName();
        List<String> fileList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            String fileName = "/Users/gaydaev/IdeaProjects/-studyingJAVA/javaStart/src/main/java/javaCore/mnogopotocnost/Future/callableProject" + threadName + i + ".txt";
            fileList.add(fileName);
            try (OutputStream ou = new FileOutputStream(fileName);
                BufferedOutputStream bos = new BufferedOutputStream(ou)) {
                bos.write(("java" + i).getBytes());
                bos.flush();
                System.out.println( threadName + fileName);
            }
        }
        Thread.sleep(1000);
        return fileList;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<List<String>>> futures = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            Callable<List<String>> fileGenerator = new FileGenerator();
            Future<List<String>> future = pool.submit(fileGenerator);
            futures.add(future);
        }
        List<String> resultList = new ArrayList<>();
        for(Future<List<String>> f : futures){
            resultList.addAll(f.get());
        }

        System.out.println(resultList);
        pool.shutdown();
    }
}
