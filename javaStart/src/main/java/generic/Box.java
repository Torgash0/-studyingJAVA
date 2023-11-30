package generic;

public class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    public static void main(String[] args) {
        Box<String> myBox = new Box();
        myBox.setT("HI");
        System.out.println(myBox.getT());
        Box<Integer> myBox1 = new Box<>();
        myBox1.setT(1);
        System.out.println(myBox1.getT());

    }
}

