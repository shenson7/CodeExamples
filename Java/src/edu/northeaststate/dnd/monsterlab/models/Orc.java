/**
 * -------------------------------------------------
 * File name: Orc.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: 1020
 * Creation date: Apr 20, 2020
 * -------------------------------------------------
 */
package edu.northeaststate.dnd.monsterlab.models;

import edu.northeaststate.dnd.util.SimpleDiceRoller;

import java.io.Serializable;

public class Orc extends Monster implements Serializable {
    private static int numOrcs = 1;
    private static final int ORC_MAX_HP = 22;
    private static final int ORC_ATTACK_DAMAGE = 0;
    private static final int ORC_ARMOR_CLASS = 0;

    public Orc() {
        super("Orc " + numOrcs, SimpleDiceRoller.roll(ORC_MAX_HP), ORC_ATTACK_DAMAGE, ORC_ARMOR_CLASS);
        numOrcs += 1;
    }

    @Override
    public String toString() {
        return "Orc{} " + super.toString();
    }
}
