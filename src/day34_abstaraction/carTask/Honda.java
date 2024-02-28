package day34_abstaraction.carTask;

import day34_abstaraction.carTask.Car;

public class Honda extends Car {

    public Honda( String model,String color, int year, double price) {
        super( model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition to start" + getMake() + " " + getModel());

    }
}
