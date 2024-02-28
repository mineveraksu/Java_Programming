package day31_inheritance.vehicleTest;

public class Airplane extends Vehicle{

    public Airplane(String brand, String model, int year, double price) {
        super(brand, model, year, price);
    }

    public void fly(){
        System.out.println(getBrand() + getModel() + "is flying");
    }
}

