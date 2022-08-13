package com.company;

public class Dog extends Animal{
    private int age;
    private String Damage;


    public Dog(int age, String name, String damage) {
        super(age, name);
        this.Damage = damage;
    }

    public String getDamage() {
        return Damage;
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\nDamage: " + Damage);
    }
}