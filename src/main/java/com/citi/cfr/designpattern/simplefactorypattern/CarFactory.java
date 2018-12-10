package com.citi.cfr.designpattern.simplefactorypattern;

public class CarFactory {

    public static Car createCar (String type) {
        if("BMW".equals(type)) {
            return new BMW();
        }
        if("Benz".equals(type)) {
            return new Benz();
        }
        return new NormalCar();
    }
}
