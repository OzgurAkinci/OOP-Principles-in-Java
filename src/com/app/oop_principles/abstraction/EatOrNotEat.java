package com.app.oop_principles.abstraction;

class EatOrNotEat {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Create a Dog object
        dog.eat(dog);
        dog.notEat();
    }
}