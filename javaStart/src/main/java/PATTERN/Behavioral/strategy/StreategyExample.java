package PATTERN.Behavioral.strategy;

import javaCore.generic.C;

public class StreategyExample {
    public static void main(String[] args) {
        //boolean fullStrategy =  true;
        double startPrice = 100;
        Context context = new Context(new FullPrice());
        double price = context.getPrice(startPrice);
        System.out.println(price);
    }
}
interface Strategy{
    double getPrice(double price);
}

class FullPrice implements Strategy{
    @Override
    public double getPrice(double price) {
        return price;
    }
}

class HalfPrice implements  Strategy{
    @Override
    public double getPrice(double price) {
        return price * 0.5;
    }
}
class Context{
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public double getPrice(double price){
        return strategy.getPrice(price);
    }
}
