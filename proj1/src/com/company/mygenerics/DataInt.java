package com.company.mygenerics;

public class DataInt {

    protected int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DataInt(int data) {
        this.data = data;
    }

    public void print() {
        System.out.println("************ " + data + " ***************");
    }
}
