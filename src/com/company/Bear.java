package com.company;

public class Bear extends Animal {
    private int claws;
    private int tail;

    public Bear(int claws, int tail) {
        this.claws = claws;
        this.tail = tail;
    }

    public int getClaws() {
        return claws;
    }

    public int getTail() {
        return tail;
    }

    @Override
    public void print() {
        System.out.println("Длина когтей" +claws +"\nХвост" +tail);
    }
}
