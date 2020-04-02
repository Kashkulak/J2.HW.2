package com.company;

public class Fish extends Animal implements Printable {
    private String view;
    private int fins;

    public Fish(int age, String name, String view, int fins) {
        super(age, name);
        this.view = view;
        this.fins = fins;
    }

    @Override
    public void print() {
        System.out.println("Имя: "+getName()+"\nВозраст: "+getAge()+"\nВид: " + view+"\nПлавников: "+fins);
    }
}
