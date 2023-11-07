package generic;

public class Gen<T> {
    T item;
    Gen(){
    }
//    static void setA(Gen<? extends A> a){
//        //Символ "?" в данном контексте означает неизвестный тип данных.
//        // Он используется в объявлении обобщенного типа Gen, чтобы указать,
//        // что тип данных может быть любым, но должен быть супертипом для типа B.
//        System.out.println("AAAAA");
//    }
//    static void srtB(Gen<? super B> b){
//        System.out.println("super");
//    }
//    public static void main(String[] args) {
//        Gen<A> genA = new Gen();
//         Gen<B> genB = new Gen();
//        Gen<C> genC = new Gen();
//        setA(genA);
//        srtB(genB);
//
//    }
static void setA(Gen<? extends A> a){
    //Символ "?" в данном контексте означает неизвестный тип данных.
    // Он используется в объявлении обобщенного типа Gen, чтобы указать,
    // что тип данных может быть любым, но должен быть супертипом для типа B.
    System.out.println("AAAAA");
}
    static void srtB(Gen<? super B> b){ //Это означает, что это метод с именем "srtB", который является статическим (принадлежит классу, а не объекту) и не возвращает никакого значения (тип void).
        //Метод принимает аргумент типа Gen, который является параметризованным типом с ограничением "super B". Это означает, что аргумент может быть типом B или любым супертипом B.
        //Супертип - это тип, который является более общим или более абстрактным, чем другой тип. Если тип A является супертипом типа B, то это означает, что объекты типа B могут быть присвоены
        // переменным типа A. Например, если класс B является подклассом класса A, то A будет супертипом для B.
        System.out.println("super");
    }
    public static void main(String[] args) {
        Gen<A> genA = new Gen();
        Gen<B> genB = new Gen();
        Gen<C> genC = new Gen();
        setA(genA);
        srtB(genB);
        setA(genC);

    }
}
