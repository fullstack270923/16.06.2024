package com.company.mygenerics;

public class Data<T> {

    protected T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Data(T data) {
        this.data = data;
    }

    public void print() {
        System.out.println("************ " + data + " ***************");
    }
}
