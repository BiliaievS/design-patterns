package com.patterns.gof.behavior.memento;

/**
 * @author Sergii Biliaiev
 * Created on 28/08/2019.
 */
public class EmpOriginatorMain {
    public static void main(String[] args) {
        EmpOriginator originator = new EmpOriginator(306, "Mark Ferguson", "131011789610", "Sales Manager");
        EmpMemento empMemento = originator.saveToMemento();
        EmpCaretaker empCaretaker = new EmpCaretaker();
        empCaretaker.addMemento(empMemento);
        System.out.println("\n Original EmpOriginator");
        originator.printInfo();

        System.out.println("\n EmpOriginator after updating phone number");
        originator.setEmpPhoneNo("1234567890");
        empMemento = originator.saveToMemento();
        empCaretaker.addMemento(empMemento);
        originator.printInfo();

        System.out.println("\n EmpOriginator after updating designation");
        originator.setEmpDesignation("Senior Sales Manager");
        empMemento = originator.saveToMemento();
        empCaretaker.addMemento(empMemento);
        originator.printInfo();

        System.out.println("\n EmpOriginator after undoing designation update");
        empMemento = empCaretaker.getMemento();
        originator.undo(empMemento);
        originator.printInfo();
        empMemento = empCaretaker.getMemento();
        originator.undo(empMemento);
        originator.printInfo();

        System.out.println("\n Original EmpOriginator after undoing phone number");
        empMemento = empCaretaker.getMemento();
        originator.undo(empMemento);
        originator.printInfo();
    }
}
