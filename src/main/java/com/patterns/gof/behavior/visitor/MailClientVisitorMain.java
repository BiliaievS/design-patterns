package com.patterns.gof.behavior.visitor;

/**
 * @author Sergii Biliaiev
 * Created on 02/09/2019.
 */
public class MailClientVisitorMain {
    public static void main(String[] args) {
        MacMailClientVisitor macVisitor = new MacMailClientVisitor();
        WindowsMailClientVisitor windowsVisitor = new WindowsMailClientVisitor();

        OperaMailClient operaMailClient = new OperaMailClient();
        SquirrelMailClient squirrelMailClient = new SquirrelMailClient();
        ZimbraMailClient zimbraMailClient = new ZimbraMailClient();

        System.out.println("-----Testing Opera Mail Client for different environments-----");
        operaMailClient.accept(macVisitor);
        operaMailClient.accept(windowsVisitor);

        System.out.println("\n-----Testing Zimbra Mail Client for different environments-----");
        zimbraMailClient.accept(macVisitor);
        zimbraMailClient.accept(windowsVisitor);

        System.out.println("\n-----Testing Squirrel mail Client for different environments-----");
        squirrelMailClient.accept(macVisitor);
        squirrelMailClient.accept(windowsVisitor);
    }
}
