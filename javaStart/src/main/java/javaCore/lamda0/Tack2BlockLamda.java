package javaCore.lamda0;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  Tack2BlockLamda {
    public static void main(String[] args) {
        String[] s1 = new String[]{"aaas", "bafsafaf", "c"};
        String[] s2 = new String[]{"ab", "bc", "cd"};
        String[] s3 = new String[]{"c", "v"};
        String[] s4 = new String[]{"aqwe", "bsda", "cfldfmslkfmd"};
        List<String[]> arrays = new ArrayList<>();
        arrays.add(s1);
        arrays.add(s2);
        arrays.add(s3);
        arrays.add(s4);

        arrays.sort((o1, o2) -> o1.length - o2.length);

        for (String[] arr : arrays) {
            System.out.println(Arrays.toString(arr));
        }
    }

}
