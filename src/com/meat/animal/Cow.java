package com.meat.animal;

public class Cow extends Animal {

    private Cow() {
    }

    public Cow(String name, String color) {
        this.name = name;
        //       System.out.println("I am a "+color+" Cow ");
    }

    Cow getSound() {

 //       moo();

        return this;
    }

    public void sound(){
        super.sound();

    }

//    void moo() {
//        System.out.println("Cow says moo");
//        super.sound();
//
//    }


}
