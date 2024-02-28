package day35_polimorphism.transportation;

public class Audi extends Car implements AutoPark{

    public Audi(String make, String model, String color, double price, int year) {
        super(make, model, color, price, year);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void autoPark() {

    }
}
