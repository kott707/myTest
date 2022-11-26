package com.meat.animal;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Barsik","blue");
        animals[1] = new Dog("Zhuchka","red");
        animals[2] = new Cow("Marusya", "white");

         showAnimal(animals);





    }

    static void showAnimal(Animal... animals) {
        System.out.println("Наши животные что говорят? ");
        for (Animal i : animals) {
            i.getSound();

        }
    }
}
