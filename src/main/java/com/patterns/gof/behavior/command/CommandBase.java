package com.patterns.gof.behavior.command;

/**
 * @author Sergii Biliaiev
 * Created on 18/08/2019.
 */
public interface CommandBase {
    void execute();

    void undo();
}
