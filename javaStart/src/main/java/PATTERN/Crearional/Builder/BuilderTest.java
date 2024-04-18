package PATTERN.Crearional.Builder;

public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new ProgrammerBuilder();
        Director director = new Director();
        builder = director.createJunior(builder);
        builder.setFirstName("ivan");
        System.out.println(builder.createProgrammer());
        builder = director.createSenior(builder);
        builder.setFirstName("Dima");
        builder.setage(10);
        builder.setLastName("Ivanov");
        System.out.println(builder.createProgrammer());
        builder =  director.createSenior(builder);
        builder.setFirstName("Vasek");
        System.out.println(builder.createProgrammer());
    }

}
