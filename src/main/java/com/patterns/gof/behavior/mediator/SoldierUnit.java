package com.patterns.gof.behavior.mediator;

/**
 * @author Sergii Biliaiev
 * Created on 24/08/2019.
 */
public class SoldierUnit implements ArmedUnit {
    private Commander commander;

    public SoldierUnit(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void attack() {
        if (commander.canAttack()) {
            System.out.println("SoldierUnit: Attacking.....");
            commander.setAttackStatus(false);
        } else {
            System.out.println(SoldierUnit.class.getName() + "Cannot attack now . Other Units attacking...");
        }
    }

    @Override
    public void stopAttack() {
        System.out.println("SoldierUnit: Stopped Attacking...");
        commander.setAttackStatus(true);
    }
}
