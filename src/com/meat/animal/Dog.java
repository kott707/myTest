package com.meat.animal;

public class Dog extends Animal {

    private Dog() {
        System.out.println("I am a Dog");
    }

    public Dog(String name, String color) {
        this.name = name;
 //       System.out.println("I am a " + color + " Dog");
    }

    Dog getSound(){

        woof();

        return this;
    }

    void woof(){
        System.out.println("Dog says woof");
        super.sound();
    }


}
