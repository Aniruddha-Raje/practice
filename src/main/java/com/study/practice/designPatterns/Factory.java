package com.study.practice.designPatterns;

interface Car {
    void drive();
}

class SUV implements Car {
    @Override
    public void drive() {
        System.out.println("Driving an SUV");
    }
}

class Sedan implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a Sedan");
    }
}

class Hatchback implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a Hatchback");
    }
}

class CarFactory {
    public static Car createCar(String type) {
        switch (type) {
            case "SUV":
                return new SUV();
            case "Sedan":
                return new Sedan();
            case "Hatchback":
                return new Hatchback();
            default:
                throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
}

public class Factory {
    public static void main(String[] args) {
        Car suv = CarFactory.createCar("SUV");
        suv.drive(); // Output: Driving an SUV

        Car sedan = CarFactory.createCar("Sedan");
        sedan.drive(); // Output: Driving a Sedan

        Car hatchback = CarFactory.createCar("Hatchback");
        hatchback.drive(); // Output: Driving a Hatchback
    }
}
