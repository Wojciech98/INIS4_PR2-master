package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
     /*   me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();*/

        Car car = new Car();
        Car dirtyOne = new Car();

        car.producer = "BMW";
        car.model = "M4";
        car.yearOfProduction = 2019;
        dirtyOne.plates="GD2013";

        me.car = dirtyOne;


        System.out.println("--------Start--------");

        System.out.println(me.car.plates);


        System.out.printf("--------Stop------");

    }
}
