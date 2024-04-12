package PATTERN.Behavioral.interpeter;

import java.util.Stack;

public class InterpretaterExample {
    public static void main(String[] args) {
        String expression = "1+2+3-4"; // 2
        Expression evaluator = new Evaluate(expression);
        System.out.println(evaluator.enterptret(evaluator));

    }
}
interface Expression{
    int enterptret(Expression context);
}
class Number implements Expression{
    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int enterptret(Expression context) {
        return number;
    }
}
class Plus implements Expression{
    Expression expressionLeft;
    Expression expressionRight;

    public Plus(Expression expressionLeft, Expression expressionRight) {
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }

    @Override
    public int enterptret(Expression context) {
        return expressionLeft.enterptret(context) + expressionRight.enterptret(context);
    }
}
class Minus extends Plus{
    Expression expressionLeft;
    Expression expressionRight;

    public Minus(Expression expressionLeft, Expression expressionRight) {
        super(expressionLeft, expressionRight);
    }

    @Override
    public int enterptret(Expression context) {
        return expressionLeft.enterptret(context) - expressionRight.enterptret(context);
    }
}
class Evaluate implements Expression{
    Expression evaluete;

    public Evaluate(String expression) {
        Stack<Expression> expressions = new Stack<>();
        String expressionRever = new StringBuilder(expression).reverse().toString();
        for (String s : expression.split("\\D")){
            expressions.push(new Number(Integer.parseInt(s)));
        }
        for (String s : expression.split("\\d")){
            if (s.equals("+")){
                expressions.push(new Plus(expressions.pop(), expressions.pop()));
            }else if (s.equals("-")){
                expressions.push(new Minus(expressions.pop(), expressions.pop()));
            }
        }
        evaluete = expressions.pop();
    }
    @Override
    public int enterptret(Expression context) {
        return evaluete.enterptret(context);
    }

}
