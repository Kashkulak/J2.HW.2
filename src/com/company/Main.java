package com.company;

public class Main {

    public static void main(String[] args) {
       createObject("1").print();
       createObject("2").print();
       createObject("3").print();

    }

    public static Printable createObject(String className) {
        Printable print = null;
        switch (className) {
            case "1":
                print = new Fish(5, "Tommy", "Gold fish", 3);
                break;
            case "2":
                print = new Bird(6, "Holly", "Eagle", 2);
                break;
            case "3":
                print = new Dog(2, "Charlie", "Labrador", "Give paw");
                break;
        }
        return print;

    }
}