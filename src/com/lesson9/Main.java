package com.lesson9;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Ghost");
        cat.feed();
        cat.walk();
        cat.play();
        cat.greets();

        System.out.println();

        Dog dog1 = new Dog("Barbas");
        Dog dog2 = new Dog("Leman");
        dog1.feed();
        dog1.walk();
        dog1.play();
        dog1.greets();
        dog1.greets(dog2);

        System.out.println();

        Lion lion = new Lion("El'Jonson");
        lion.hunting();
        lion.greets();

        System.out.println();

        Wolf wolf = new Wolf("Ragnar");
        wolf.hunting();
        wolf.greets();

        System.out.println();

        BigDog bigDog1 = new BigDog("Bigby");
        BigDog bigDog2 = new BigDog("Doll");
        bigDog1.greets();
        bigDog1.greets(dog1);
        bigDog2.greets(bigDog1);
    }
}
