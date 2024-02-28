package day35_polimorphism.transportation;

import day34_abstaraction.animalTask.Flayble;
import day34_abstaraction.animalTask.Swimmable;

public class CydeoCar extends Car implements Flayble,Electric,AutoPilot, Swimmable {

    public CydeoCar(String make, String model, String color, double price, int year) {
        super(make, model, color, price, year);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public Void selfDrive() {
        return null;
    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
