package SOLID.Builder;

import java.util.ArrayList;
import java.util.List;

public class Director {
    public Builder createJunior (Builder builder){
        List<String> hardSkills = new ArrayList<>();
        hardSkills.add("Java Core");
        hardSkills.add("OS Windows");
        hardSkills.add("NodePas++");
        builder.setHardSkills(hardSkills);
        List<String> softSkills = new ArrayList<>();
        softSkills.add("Трудолюбивый");
        softSkills.add("Веселый");
        softSkills.add("Любознательный");
        builder.setSoftSkills(softSkills);
        return builder;
    }
    public Builder createMiddle(Builder builder){
        List<String> hardSkills = new ArrayList<>();
        hardSkills.add("Java EE");
        hardSkills.add("OS Linuxs");
        hardSkills.add("VS code");
        builder.setHardSkills(hardSkills);
        List<String> softSkills = new ArrayList<>();
        softSkills.add("Спокойный");
        softSkills.add("Рассудительный");
        softSkills.add("Коммуникабельный");
        builder.setSoftSkills(softSkills);
        return builder;
    }
    public Builder createSenior(Builder builder){
        List<String> hardSkills = new ArrayList<>();
        hardSkills.add("Micro Service");
        hardSkills.add("OS Mac");
        hardSkills.add("Spring ");
        builder.setHardSkills(hardSkills);
        List<String> softSkills = new ArrayList<>();
        softSkills.add("Псих");
        softSkills.add("Маньяк");
        softSkills.add("Убийца");
        builder.setSoftSkills(softSkills);
        return builder;
    }

}
