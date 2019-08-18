package com.patterns.gof.behavior.command;

/**
 * @author Sergii Biliaiev
 * Created on 18/08/2019.
 */
public class TopStopRotateCommand implements CommandBase {

    private RotatingTop rotatingTop;

    public TopStopRotateCommand(RotatingTop rotatingTop) {
        this.rotatingTop = rotatingTop;
    }

    @Override
    public void execute() {
        System.out.println("TopStopRotateCommand.execute(): Invoking stopRotating() on RotatingTop");
        rotatingTop.stopRotating();
    }

    @Override
    public void undo() {
        System.out.println("TopStopRotateCommand.undo(): Undoing previous action->Invoking startRotating() on RotatingTop");
        rotatingTop.startRotating();
    }

}
