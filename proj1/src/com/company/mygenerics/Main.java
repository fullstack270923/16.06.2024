package com.company.mygenerics;

public class Main {

    public static void main(String[] args) {

        Data<Float> d1 = new Data<Float>(2.5f);
        Data<Double> d2 = new Data<Double>(2.5);
        Data<String> d3 = new Data<String>("hi");
        print(d3);
    }

    static void print(Data<?> d1) {

    }
}
