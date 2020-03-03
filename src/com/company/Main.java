package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();

        Car car = new Car();
        Human wifeObject = new Human("Jolanta","Kowlaska");

        Car dirtyOne = new Car();
        car.producer = "BMW";
        car.model = "M4";
        car.yearOfProduction = 2019;
        dirtyOne.plates = "GD2013";

        me.car = dirtyOne;

        me.riseMySalry();


        wifeObject.setGender(false);
        String driver = wifeObject.whoDrive();

        String decisionToBuy = me.buyCar();

        String wife = wifeObject.nameAndLast();

        System.out.println("--------Start--------");


  /*      System.out.println(me.car.plates);
        System.out.println(me.getSalry().toString());*/
        /*    System.out.println(decisionToBuy);*/

        System.out.println(driver);
        System.out.println(wife);

        System.out.println("--------Stop------");


    }
}
