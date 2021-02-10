package com.narine;

public class Main {

    public static void main(String[] args) {
        HavingSuperAbility hero [] = {new Medic (), new Magic(), new Warrior()};
        for (int i = 0; i < hero.length; i++) {
            allSuperAbilities(hero[i]);

        }
    }

    public static void allSuperAbilities (HavingSuperAbility havingSuperAbility) {
        System.out.println(havingSuperAbility.applySuperAbility(""));
    }



}
