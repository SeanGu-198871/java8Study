package com.citi.cfr.designpattern.simplefactorypattern;

public class MainTest {
    public static void main(String args[]) {
        Car BMW = CarFactory.createCar("BMW");
        Car Benz = CarFactory.createCar("Benz");
        Car Normal = CarFactory.createCar("abc");
        BMW.drive();
        Benz.drive();
        Normal.drive();

    }
}
