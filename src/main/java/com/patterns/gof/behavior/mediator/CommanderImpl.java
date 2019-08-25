package com.patterns.gof.behavior.mediator;

/**
 * @author Sergii Biliaiev
 * Created on 24/08/2019.
 */
public class CommanderImpl implements Commander {

    private ArmedUnit soldier, tank;
    private boolean attackStatus = true;

    @Override
    public void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit) {
        this.soldier = soldierUnit;
        this.tank = tankUnit;
    }

    @Override
    public void setAttackStatus(boolean attackStatus) {
        this.attackStatus = attackStatus;
    }

    @Override
    public boolean canAttack() {
        return attackStatus;
    }

    @Override
    public void startAttack(ArmedUnit unit) {
        unit.attack();
    }

    @Override
    public void ceaseAttack(ArmedUnit unit) {
        unit.stopAttack();
    }
}
