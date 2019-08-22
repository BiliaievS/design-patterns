package com.patterns.gof.behavior.Interpreter;

/**
 * @author Sergii Biliaiev
 * Created on 23/08/2019.
 */
public class ExpressionParserMain {
    public static void main(String[] args) {
        String inout = "2 1 5 + *";
        ExpressionParser expressionParser = new ExpressionParser();
        int result = expressionParser.parse(inout);
        System.out.println("Final result: " + result);
    }
}
