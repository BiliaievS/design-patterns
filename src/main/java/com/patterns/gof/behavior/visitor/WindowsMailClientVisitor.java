package com.patterns.gof.behavior.visitor;

/**
 * @author Sergii Biliaiev
 * Created on 02/09/2019.
 */
public class WindowsMailClientVisitor implements MailClientVisitor {
    @Override
    public void visit(OperaMailClient mailClient) {
        System.out.println("Configuration of Opera mail client for Windows complete");
    }

    @Override
    public void visit(SquirrelMailClient mailClient) {
        System.out.println("Configuration of Squirrel mail client for Windows complete");
    }

    @Override
    public void visit(ZimbraMailClient mailClient) {
        System.out.println("Configuration of Zimbra mail client for Windows complete");
    }
}
