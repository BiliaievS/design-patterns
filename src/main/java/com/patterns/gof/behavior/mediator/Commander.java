package com.patterns.gof.behavior.mediator;

/**
 * @author Sergii Biliaiev
 * Created on 24/08/2019.
 */
public interface Commander {
    void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit);

    void setAttackStatus(boolean attackStatus);

    boolean canAttack();

    void startAttack(ArmedUnit unit);

    void ceaseAttack(ArmedUnit unit);
}
