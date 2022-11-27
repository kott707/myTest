package com.meat.animal;

public class Animal {
    Cat cat;
    String name;

    protected Animal() {}

    public static void weCheckOurself(Object...objects){

        for (Object i: objects) {
            if (i.toString().contains("Cat")) {
                ((Cat) i).meow();
            } else if (i.toString().contains("Dog")){
                ((Dog)i).woof();
            } else if(i.toString().contains("Cow")){
                ((Cow)i).moo();
            }
        }

    }

    Animal getSound(){

        return this;
    }

    protected void sound(){
        System.out.println("Was sound of Animal "+name);

    }


}
