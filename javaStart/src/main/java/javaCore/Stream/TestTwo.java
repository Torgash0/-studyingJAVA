package javaCore.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestTwo {
    public static void main(String[] args) {
        List<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 42, Sex.MAN),
                new People("Миша", 16, Sex.MAN),
                new People("Вася", 19, Sex.WOMAN),
                new People("Вера", 87, Sex.WOMAN),
                new People("Катя", 69, Sex.WOMAN));
        List<People> peopleList1 =  peoples.stream().filter(p -> p.getAge() >= 18 && p.getAge() <=27 && p.getSex() == Sex.MAN).collect(Collectors.toList());
        peoples.stream().forEach(System.out::println);
        System.out.println(peopleList1);
        double avereAge = peoples.stream().filter(p -> p.getSex() == Sex.MAN).mapToInt(People::getAge).average().getAsDouble();
        System.out.println(avereAge);
        List<People> peopleList2 =  peoples.stream().filter(p -> p.getAge() >= 18).filter(people -> (people.getSex() == Sex.MAN && people.getAge() < 60)
        || (people.getSex() == Sex.WOMAN && people.getAge() >55 )).collect(Collectors.toList());
        System.out.println(peopleList2);


        peoples.stream().sorted(new peopleAgeComparator()).forEach( System.out::println);
        System.out.println(" ");
        peoples.stream().sorted(new peopleNameComparator()).forEach(System.out::println);
        System.out.println(" ");
        peoples.stream().sorted(new peopleAgeComparator().thenComparing(new peopleNameComparator())).forEach(System.out::println);
    }
}
class  peopleAgeComparator implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return o1.getAge() - o2.getAge();
    }
}
class  peopleNameComparator implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class People{
    private String name;
    private int age;
    private Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
enum Sex{
    MAN, WOMAN;
}
