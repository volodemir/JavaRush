package main.java.org.javaRush.lesson2;

public class Dog {
    String name;
    Woman owner;

    public Dog(String name, Woman owner) {
        this.name = name;
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Woman owner) {
        this.owner = owner;
    }
}
