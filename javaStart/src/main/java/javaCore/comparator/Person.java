package javaCore.comparator;

public class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "Person{" +
                "name= " + name + '\'' + "}";
    }

    @Override
    public int compareTo(Person p) {
        return name.compareTo(p.name);
    }
}
