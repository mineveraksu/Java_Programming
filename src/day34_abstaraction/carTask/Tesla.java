package day34_abstaraction.carTask;

import day34_abstaraction.carTask.Car;

public class Tesla extends Car {

    public Tesla(String model, String color, int year, double price) {
        super( model, color, year, price);
    }

    @Override
    protected void start() {
        System.out.println("Use voice control to start" + getMake() + getModel());

    }

    public void autoPilot(){
        System.out.println(getMake() + " " + getModel() + " has auto pilot feature");

    }

}
