package com.company;

public class Main {

    public static void main(String[] args) {
        Printable print[] = {createObject("John"), createObject("krivetka"), createObject("Misha")};
        for (Printable printable: print){
            printable.print();
        }
    }

    public static Printable createObject(String className) {

        switch (className){
            case "John":
                Dog dog= new Dog(10, "John", "Кусать");

                return dog;

            case "krivetka":
                Cat cat = new Cat(4, "krivetka", "Царапать");
                return cat;

            case "Misha":
                Bear bear = new Bear(5, "Misha","удар лапой");
                return bear;
        }
        return null;
    }
}
