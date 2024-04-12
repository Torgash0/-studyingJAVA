package javaCore.comparator;

import java.util.ArrayList;
import java.util.TreeSet;

public class PersonTest {
    public static void main(String[] args) {
        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person("Tom"));
        personTreeSet.add(new Person("Vera"));
        personTreeSet.add(new Person("Katya"));
//        ArrayList<Person> arrayList =  new ArrayList<>();
//        arrayList.sort();

        System.out.println(personTreeSet);
    }
}
