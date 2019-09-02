package com.patterns.gof.behavior.visitor;

/**
 * @author Sergii Biliaiev
 * Created on 02/09/2019.
 */
public interface MailClientVisitor {
    void visit(OperaMailClient mailClient);

    void visit(SquirrelMailClient mailClient);

    void visit(ZimbraMailClient mailClient);
}
