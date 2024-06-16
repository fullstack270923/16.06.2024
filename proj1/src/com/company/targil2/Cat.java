package com.company.targil2;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void greet() {
        System.out.println("Meow");
    }
}
