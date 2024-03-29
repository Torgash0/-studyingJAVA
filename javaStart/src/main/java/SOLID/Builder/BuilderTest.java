package SOLID.Builder;

public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new ProgrammerBuilder();
        Director director = new Director();
        builder = director.createJunior(builder);
        builder.setFirstName("ivan");
        System.out.println(builder.createProgrammer());
        builder = director.createSenior(builder);
        builder.setFirstName("Ivan");
        System.out.println(builder.createProgrammer());
    }
}
