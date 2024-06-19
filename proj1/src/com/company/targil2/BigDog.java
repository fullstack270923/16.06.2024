package com.company.targil2;

public class BigDog extends Dog {

    static float avg_size = 0.5f;

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greet() {
        System.out.println("Wooow");
    }

    @Override
    public void greet(Dog another) {
        System.out.println("Woooooooof");
        another.greet();
    }

    public void greet(BigDog another) {
        System.out.println("Woooooooooooof");
        another.greet();
    }

    // class Person - id, name, height, age
    // class abs Occupation
    // class Teacher - teach
    // class Pilot - fly-plane

    // class Person
    //    protected Occupation occup;
    //    occup = new Pilot();
    // ....
    //    occup = new Teach();
}
