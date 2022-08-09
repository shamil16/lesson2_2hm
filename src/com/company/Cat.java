package com.company;

public class Cat extends Animal{
    private String color;
    private String breed;

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void print() {
        System.out.println("Порода: " +breed +"\nЦвет" +color);
    }
}
