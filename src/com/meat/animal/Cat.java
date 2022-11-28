package com.meat.animal;

public class Cat extends Animal{

    private Cat() {
        System.out.println("I am a Cat");
    }

    public Cat(String name, String color) {
      //  this.name = name;
   //     this();
        System.out.println("I am a " + color + " Cat");
    }

    Cat getSound(){

        meow();

        return this;
    }

    void meow(){
        System.out.println("Cat says meow");
        super.sound();
    }
}
