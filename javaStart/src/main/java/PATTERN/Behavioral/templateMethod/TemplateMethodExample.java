package PATTERN.Behavioral.templateMethod;

public class TemplateMethodExample {
    public static void main(String[] args) {
        Templatee templatee = new Job();
        Templatee templatee1 = new Bot();
        templatee.run();
        System.out.println();
        templatee1.run();

    }
}
abstract class Templatee{
    abstract void stepOne();
    abstract void stepTwo();
    abstract void stepTree();
    void run(){
        stepOne();
        stepTwo();
        stepTree();
    }

}
class Job extends Templatee{
    @Override
    void stepOne() {
        System.out.println("firstStep");
    }

    @Override
    void stepTwo() {
        System.out.println("secondStep");

    }

    @Override
    void stepTree() {
        System.out.println("thrirdStep");

    }
}
class Bot extends Templatee{
    @Override
    void stepOne() {
        System.out.println("send");
    }

    @Override
    void stepTwo() {
        System.out.println("past");

    }

    @Override
    void stepTree() {
        System.out.println("close");

    }
}
