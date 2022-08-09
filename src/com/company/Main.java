package com.company;

public class Main {

    public static void main(String[] args) {
        Printable[] printables={createObject("Dog"),createObject("Cat"),createObject("Bear")};
        for (Printable print:printables) {
            print.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {

            case "dog":
                Dog dog = new Dog(13, "John");
                return dog;
            case "сat":
                Cat cat = new Cat("Black","Сиамская");
                return cat;
            case "Bear":
                Bear bear = new Bear(10,23);
                return bear;
        }
        return null;
    }
}
