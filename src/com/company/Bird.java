package com.company;

public class Bird extends Animal implements Printable{
    private String view;
    private int wings;

    public Bird( int age,String name, String view, int wings) {
        super(age, name);
        this.view = view;
        this.wings = wings;
    }


    @Override
    public void print() {
        System.out.println("Имя: "+getName()+"\nВозраст: "+getAge()+"\nВид: "+view+"\nКрыльев: "+wings);
    }
}
