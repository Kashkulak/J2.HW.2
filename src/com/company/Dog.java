package com.company;

public class Dog extends Animal implements Printable {
    private String breed;
    private String command;

    public Dog(int age, String name, String breed, String command) {
        super(age, name);
        this.breed = breed;
        this.command = command;
    }

    @Override
    public void print() {
        System.out.println("Имя: "+getName()+"\nВозраст: "+getAge()+"\nПорода: "+ breed+"\nКоманды: "+command);
    }
}
/* если вам вдруг  в метро бабка нахамила, вас пихнула локтём, на ногу наступила,
улыбнитесь в лицо ей вместо ответа, ведь старушку эту - мы переживём!!!!
 */
