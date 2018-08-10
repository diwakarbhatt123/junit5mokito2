package com.airtel;

public class DummyClass2 {

    private String name;

    private String number;

    public String setNameFromDummyClass(DummyClass dummyClass){
        this.name = dummyClass.getName();
        return this.name;
    }

    public boolean isValid(String number){
        return (number.length() == 10);
    }

}
