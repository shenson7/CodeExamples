package edu.northeaststate.dnd.randomencounters;

import edu.northeaststate.dnd.randomencounters.monsters.Monster;

import java.util.Comparator;

public class CompareByName implements Comparator<Monster> {
    @Override
    public int compare(Monster m1, Monster m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
