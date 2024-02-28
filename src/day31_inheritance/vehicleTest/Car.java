package day31_inheritance.vehicleTest;

public class Car extends Vehicle{

    public Car(String brand, String model, int year, double price) {
        super(brand, model, year, price);
    }

    public void drive(){
        System.out.println("Driving" + getBrand() + getModel());
    }
}

