package day31_inheritance.vehicleTest;

public class Boat extends Vehicle {

    public Boat(String brand, String model, int year, double price) {
        super(brand, model, year, price);
    }

    public void sail(){
        System.out.println(getBrand() + getModel() + "is sailing");
    }
}
