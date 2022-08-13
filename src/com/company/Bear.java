package com.company;

public class Bear extends Animal {
    private String Damage;


    public Bear(int age, String name, String Damage) {
        super(age, name);
        this.Damage = Damage;
    }

    public String getDamage() {
        return Damage;
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\nDamage: " + Damage);
    }
}