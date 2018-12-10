package com.citi.cfr.designpattern.factorymethodpattern;

public class BMWFactory implements CarFactoryNew {
    public CarAction createCar() {
        return new BMWNew();
    }
}
