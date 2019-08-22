package com.patterns.gof.behavior.Interpreter;

/**
 * @author Sergii Biliaiev
 * Created on 22/08/2019.
 */
public class ParserUtil {

    public static boolean isOpetor(String symbol) {
        return "*".equals(symbol) || "-".equals(symbol) || "+".equals(symbol);
    }

    public static Expression getExpresionObj(Expression first, Expression second, String symbol) {
        if ("+".equals(symbol)) {
            return new AdditionExpression(first, second);
        } else if ("-".equals(symbol)) {
            return new SubtractionExpression(first, second);
        } else {
            return new MultiplicationExpression(first, second);
        }
    }
}
