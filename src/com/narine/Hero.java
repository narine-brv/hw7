package com.narine;

public abstract class Hero implements HavingSuperAbility {
    private int age;
    private int damage;
    private String typeOfSuperPower;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfSuperPower() {
        return typeOfSuperPower;
    }

    public void setTypeOfSuperPower(String typeOfSuperPower) {
        this.typeOfSuperPower = typeOfSuperPower;
    }


}
