package com.company.mygenerics;

public class DataFloat {

    protected float data;

    public float getData() {
        return data;
    }

    public void setData(float data) {
        this.data = data;
    }

    public DataFloat(float data) {
        this.data = data;
    }

    public void print() {
        System.out.println("************ " + data + " ***************");
    }
}
