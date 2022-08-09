package com.company;

public class Dog extends Animal{
    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Количество лет: " +age +"\nИмя: " +name);
    }
}
