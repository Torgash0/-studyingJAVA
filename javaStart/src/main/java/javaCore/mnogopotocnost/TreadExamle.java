package javaCore.mnogopotocnost;

public class TreadExamle extends  Thread{


    public TreadExamle(String name){
        super (name);
    }

    @Override
    public void run() {

        System.out.println(this.getName());
    }

    public static void main(String[] args) {
        TreadExamle treadExamle1 = new TreadExamle("111");
        treadExamle1.start();
        TreadExamle treadExamle2 = new TreadExamle("222");
        treadExamle2.start();
        TreadExamle treadExamle3 = new TreadExamle("333");
        treadExamle3.start();
    }

}
