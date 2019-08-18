package com.patterns.gof.behavior.command;

/**
 * @author Sergii Biliaiev
 * Created on 18/08/2019.
 */
public class RemoteControl {
    private CommandBase onCommand, offCommand, undoCommand;

    public void onButtonPressed(CommandBase command) {
        onCommand = command;
        onCommand.execute();
        undoCommand = command;
    }

    public void offButtonPressed(CommandBase command) {
        offCommand = command;
        offCommand.execute();
        undoCommand = command;
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }
}
