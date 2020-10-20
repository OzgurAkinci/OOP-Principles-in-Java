package com.app.oop_principles.inheritance;

public class Eat { // Inheritance
    public static void main(String args[]) {
        Cat cat = new Cat();
        cat.name = "Tom";
        cat.type = "Big";
        cat.tailLength = 30;
        cat.numberOfLegs = 4;
        cat.weight = 12;
        cat.isDead = false;

        Mouse mouse = new Mouse();
        mouse.name = "Murphy";
        mouse.type = "Small";
        mouse.tailLength = 5;
        mouse.numberOfLegs = 4;
        mouse.weight = 2;
        mouse.isDead = false;

        System.out.println("Mouse is " + mouse.weight + " kg.");
        System.out.println("Cat is " + cat.weight + " kg.");
        cat.eat(mouse);
        System.out.println("The cat ate the mouse.");
        System.out.println("Mouse isDead: " + mouse.isDead);
        System.out.println("Cat is " + cat.weight);

    }
}