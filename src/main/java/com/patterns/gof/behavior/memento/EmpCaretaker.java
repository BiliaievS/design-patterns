package com.patterns.gof.behavior.memento;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Sergii Biliaiev
 * Created on 28/08/2019.
 */
public class EmpCaretaker {
    private final Deque<EmpMemento> mementos = new ArrayDeque<>();

    public EmpMemento getMemento() {
        return mementos.pop();
    }

    public void addMemento(EmpMemento memento) {
        mementos.push(memento);
    }
}
