package day35_polimorphism.transportation;

import day34_abstaraction.animalTask.Flayble;

public abstract class Plane extends Transportation implements Flayble {

    public Plane(String make, String model, String color, double price, int year) {
        super(make, model, color, price, year);
    }

    public void land(){

    }

    @Override
    public void fly() {

    }
}
