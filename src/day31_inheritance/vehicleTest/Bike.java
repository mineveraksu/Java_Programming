package day31_inheritance.vehicleTest;

public class Bike extends Vehicle{

    public Bike(String brand, String model, int year, double price) {
        super(brand, model, year, price);
    }

    public void ride(){
        System.out.println("riding" + getBrand() + getModel());
    }
}
