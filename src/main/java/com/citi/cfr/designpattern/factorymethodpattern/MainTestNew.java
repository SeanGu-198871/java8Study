package com.citi.cfr.designpattern.factorymethodpattern;

public class MainTestNew {
    public static void main(String args[]) {
        BenzFactory f = new BenzFactory();
        f.createCar().drive();
        BMWFactory f1 = new BMWFactory();
        f1.createCar().drive();
    }
}
