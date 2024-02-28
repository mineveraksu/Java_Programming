package day32_finalKeyword.carTask_methodOverriding;

public class BMW extends Car{
    public BMW(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void start(){
        System.out.println("call the mekanik or jump start to start" + getMake() + " " + getModel());
    }
}
