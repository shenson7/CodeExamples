/**
 * -------------------------------------------------
 * File name: Encounter.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */
package edu.northeaststate.dnd.monsterlab.models;

import edu.northeaststate.dnd.monsterlab.comparators.CompareByName;

import java.io.Serializable;
import java.util.ArrayList;

public class Encounter implements Serializable {
    private ArrayList<Monster> monsters;

    public Encounter() {
        this.monsters = new ArrayList<>();
    }

    public void addMonster(Monster monster) {
        this.monsters.add(monster);
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }

    public void sortMonstersByName() {
        this.monsters.sort(new CompareByName());
    }

    @Override
    public String toString() {
        return "Encounter{" +
                "monsters=" + monsters +
                '}';
    }
}
