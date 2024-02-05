package javaCore.generic.Primer;

public class Example<T, V> {
    private String string = " ";

    public String getString() {
        return string;
    }
    public void  add(T t, V v){
        this.string = this.string + t.toString() + " " + v.toString() ;
    }
}
