package com.patterns.gof.behavior.command;

/**
 * @author Sergii Biliaiev
 * Created on 18/08/2019.
 */
public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        System.out.println("\n-----Testing onButtonPressed on RemoteControl for Car-----");
        Car car = new Car();
        CarMoveCommand carMoveCommand = new CarMoveCommand(car);
        remoteControl.onButtonPressed(carMoveCommand);

        System.out.println("\n-----Testing offButtonPressed on RemoteControl for Car-----");
        CommandBase carStopCommand=new CarStopCommand(car);
        remoteControl.offButtonPressed(carStopCommand);

        System.out.println("\n-----Testing undoButtonPressed() on RemoteControl for Car-----");
        remoteControl.undoButtonPressed();

        System.out.println("\n-----Testing onButtonPressed on RemoteControl for RotatingTop-----");
        RotatingTop top=new RotatingTop();
        CommandBase topRotateCommand=new TopRotateCommand(top);
        remoteControl.onButtonPressed(topRotateCommand);

        System.out.println("\n-----Testing offButtonPressed on RemoteControl for RotatingTop-----");
        CommandBase topStopRotateCommand=new TopStopRotateCommand(top);
        remoteControl.offButtonPressed(topStopRotateCommand);
    }
}
