package day35_polimorphism.transportation;

public abstract class Car extends Transportation{
    public Car(String make,String model, String color, double price, int year) {
        super(make,model, color, price, year);
    }

    public void drive(){
        System.out.println("driving" + getMake() + getModel());
    }
}
