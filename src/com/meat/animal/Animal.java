package com.meat.animal;

public class Animal {

    String name;

    protected Animal() {}

    Animal getSound(){

        return this;
    }

    protected void sound(){
        System.out.println("Was sound of Animal "+name);

    }


}
