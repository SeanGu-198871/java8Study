package com.citi.cfr.designpattern.factorymethodpattern;

public class BenzFactory implements CarFactoryNew {
    public CarAction createCar() {
        return new BenzNew();
    }
}
