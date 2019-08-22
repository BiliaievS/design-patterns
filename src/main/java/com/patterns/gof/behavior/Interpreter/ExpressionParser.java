package com.patterns.gof.behavior.Interpreter;

import java.util.Stack;

/**
 * @author Sergii Biliaiev
 * Created on 23/08/2019.
 */
public class ExpressionParser {
    private Stack<Expression> stack = new Stack<>();

    public int parse(String in) {
        String[] tokenList = in.split(" ");
        for (var symbol : tokenList) {
            if (ParserUtil.isOpetor(symbol)) {
                Expression firstExpr = stack.pop();
                Expression secondExpr = stack.pop();
                System.out.println(String.format("Popped operands %d and %d", firstExpr.interpret(), secondExpr.interpret()));
                Expression operator = ParserUtil.getExpresionObj(firstExpr, secondExpr, symbol);
                System.out.println(String.format("Applying Operator: %s", operator));

                int res = operator.interpret();
                NumberExpression numberExpression = new NumberExpression(res);
                stack.push(numberExpression);
                System.out.println(String.format("Pushed result to stack: %d", numberExpression.interpret()));
            } else {
                NumberExpression expression = new NumberExpression(symbol);
                stack.push(expression);
                System.out.println(String.format("Pushed to stack: %d", expression.interpret()));
            }
        }
        int result = stack.pop().interpret();
        return result;
    }
}
