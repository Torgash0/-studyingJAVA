package SOLID.Builder;

import java.util.List;

public class Programmer {
    private String firsrName;
    private String lastName;
    private int age;
    private List<String> hardSkills;
    private List<String> softSkills;

    public Programmer(String firsrName, String lastName, int age, List<String> hardSkills, List<String> softSkills) {
        this.firsrName = firsrName;
        this.lastName = lastName;
        this.age = age;
        this.hardSkills = hardSkills;
        this.softSkills = softSkills;
    }

    public String getFirsrName() {
        return firsrName;
    }

    public void setFirsrName(String firsrName) {
        this.firsrName = firsrName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHardSkills() {
        return hardSkills;
    }

    public void setHardSkills(List<String> hardSkills) {
        this.hardSkills = hardSkills;
    }

    public List<String> getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(List<String> softSkills) {
        this.softSkills = softSkills;
    }


    @Override
    public String toString() {
        return "Programmer{" +
                "firsrName='" + firsrName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hardSkills=" + hardSkills +
                ", softSkills=" + softSkills +
                '}';
    }
}
