package javaCore.mnogopotocnost.Future;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallbleExample implements Callable {
    private String word;

    public CallbleExample(String word) {
        this.word = word;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + word.length());
        return Integer.valueOf(word.length());
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");

        ExecutorService pool = Executors.newFixedThreadPool(10);
        Set<Future<Integer>> set1 = new HashSet<>();
        for (String word : strs) {
            Callable<Integer> callable = new CallbleExample(word);
            Future<Integer> future = pool.submit(callable);
            set1.add(future);
        }
        int sum = 0;
        for (Future<Integer> future : set1) {
            sum += future.get();

        }
        System.out.println(sum);
        pool.shutdown();
    }
}
