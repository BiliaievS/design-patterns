package com.patterns.gof.behavior.mediator;

/**
 * @author Sergii Biliaiev
 * Created on 26/08/2019.
 */
public class CommanderImplMain {
    public static void main(String[] args) {
        CommanderImpl commander = new CommanderImpl();
        SoldierUnit soldierUnit = new SoldierUnit(commander);
        TankUnit tankUnit = new TankUnit(commander);

        commander.registerArmedUnits(soldierUnit, tankUnit);
        commander.startAttack(soldierUnit);
        commander.startAttack(tankUnit);
        commander.ceaseAttack(soldierUnit);
        commander.startAttack(tankUnit);
    }
}
