package com.patterns.gof.behavior.Interpreter;

/**
 * @author Sergii Biliaiev
 * Created on 22/08/2019.
 */
public class NumberExpression implements Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this(Integer.parseInt(number));
    }

    @Override
    public int interpret() {
        return number;
    }
}
