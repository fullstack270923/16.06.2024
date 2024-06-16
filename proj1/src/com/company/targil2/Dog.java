package com.company.targil2;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greet() {
        System.out.println("Woof");
    }

    public void greet(Dog another) {
        System.out.println("Woooof");
        another.greet();
    }
}
