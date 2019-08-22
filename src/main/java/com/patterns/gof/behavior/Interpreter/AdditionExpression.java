package com.patterns.gof.behavior.Interpreter;

/**
 * @author Sergii Biliaiev
 * Created on 22/08/2019.
 */
public class AdditionExpression implements Expression {

    private Expression firstExpresion, secondExpresion;

    public AdditionExpression(Expression firstExpresion, Expression secondExpresion) {
        this.firstExpresion = firstExpresion;
        this.secondExpresion = secondExpresion;
    }

    @Override
    public int interpret() {
        return firstExpresion.interpret() + secondExpresion.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}
