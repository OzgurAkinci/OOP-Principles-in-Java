package com.app.oop_principles.abstraction;

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void notEat();
    // Regular method
    public void eat(Object obj) {
        System.out.println(obj.getClass() + " is relaxed.");
    }
}

