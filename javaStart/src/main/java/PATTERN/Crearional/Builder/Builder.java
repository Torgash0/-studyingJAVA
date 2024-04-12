package PATTERN.Crearional.Builder;

import java.util.List;

public interface Builder {
    void setFirstName(String firstName);

    void setLastName(String lastName);

    void setage(int age);

    void setHardSkills(List<String> hardSkills);

    void setSoftSkills(List<String> softSkills);

    Programmer createProgrammer();
}
