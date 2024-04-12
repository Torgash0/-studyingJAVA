package PATTERN.Behavioral.chainOfResponsibility;

import javaCore.generic.C;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        MassagePrinter massagePrinter = new ConsoleMassagePrinter();
        FileMassagePrinter fileMassagePrinter = new FileMassagePrinter();
        massagePrinter.setNextMassagePrinter(fileMassagePrinter);
        fileMassagePrinter.setNextMassagePrinter(new DbMassagePrinter());
        massagePrinter.print("hello");
    }
}
abstract class MassagePrinter{
    MassagePrinter nextMassagePrinter;
    void setNextMassagePrinter(MassagePrinter massagePrinter){
        nextMassagePrinter = massagePrinter;
    }
    void print(String massage){
        printMassage(massage);
        if (nextMassagePrinter != null){
            nextMassagePrinter.print(massage);
        }
    }
    abstract void printMassage(String massage);
}
class ConsoleMassagePrinter extends MassagePrinter{
    @Override
    void printMassage(String massage) {
        System.out.println("print to console " + massage);
    }
}

class FileMassagePrinter extends MassagePrinter{
    @Override
    void printMassage(String massage) {
        System.out.println("print to file " + massage);
    }
}

class DbMassagePrinter extends MassagePrinter{
    @Override
    void printMassage(String massage) {
        System.out.println("print to db" + massage);
    }
}
