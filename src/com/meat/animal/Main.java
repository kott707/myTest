package com.meat.animal;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Barsik","blue");
        animals[1] = new Dog("Zhuchka","red");
        animals[2] = new Cow("Marusya", "white");

        //статический метод в Мейн, обходим запросы instanceof + getClass и тд
  //      showAnimal(animals);

        //статический метод в Animal, проверяем наличие корневого слова названия класса, к примеру Dog
 //       Animal.weCheckOurself(animals);

        /*
        два метода работают, и имеют разный принцип действий.

         */

        animals[2].sound();
        animals[1].sound();







    }

    static void showAnimal(Animal... animals) {
        System.out.println("Наши животные что говорят? ");
        for (Animal i : animals) {
            i.getSound();

        }
    }
}
