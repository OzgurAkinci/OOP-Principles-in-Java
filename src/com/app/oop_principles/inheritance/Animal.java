package com.app.oop_principles.inheritance;

class Animal {
    String name; // tom, jerry, etc..
    String type; // big, small..
    Integer numberOfLegs; // 2,4..
    Integer weight; // 10kg
    Boolean isDead; // true,false
    Integer tailLength; // tail length: special for both
    void eat(Animal animal_) {
        weight += animal_.weight;
        animal_.isDead = true;
    }
}

