package com.patterns.gof.behavior.command;

/**
 * @author Sergii Biliaiev
 * Created on 18/08/2019.
 */
public class TopRotateCommand implements CommandBase {
    private RotatingTop rotatingTop;

    public TopRotateCommand(RotatingTop rotatingTop) {
        this.rotatingTop = rotatingTop;
    }

    @Override
    public void execute() {
        System.out.println("TopRotateCommand.execute(): Invoking startRotating() on RotatingTop");
        rotatingTop.startRotating();
    }

    @Override
    public void undo() {
        System.out.println("TopRotateCommand.undo(): Undoing previous action->Invoking stopRotating() on RotatingTop");
        rotatingTop.stopRotating();
    }
}
