package SOLID.Builder;

import java.util.List;

public class ProgrammerBuilder implements Builder{
    private String firsrName;
    private String lastName;
    private int age;
    private List<String> hardSkills;
    private List<String> softSkills;

    @Override
    public void setFirstName(String firstName) {
        this.firsrName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    @Override
    public void setage(int age) {
        this.age = age;

    }

    @Override
    public void setHardSkills(List<String> hardSkills) {
        this.hardSkills = hardSkills;

    }

    @Override
    public void setSoftSkills(List<String> softSkills) {
        this.softSkills = softSkills;

    }

    @Override
    public Programmer createProgrammer() {
        return new Programmer(firsrName, lastName, age, hardSkills, softSkills);
    }
}
