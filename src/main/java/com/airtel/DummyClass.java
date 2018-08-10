package com.airtel;

public class DummyClass {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int addNumbers(int a, int b){
        return a+b;
    }

    @Override
    public String toString() {
        return "com.airtel.DummyClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
