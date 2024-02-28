package day35_polimorphism.transportation;

public class Tesla extends Car implements Electric,AutoPilot{
    public Tesla(String make, String model, String color, double price, int year) {
        super(make, model, color, price, year);
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
