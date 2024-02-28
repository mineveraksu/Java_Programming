package day30_inheritance.phoneTask;

public class Samsung extends Phone{

    public Samsung( String model, String size, String color, double price) {
        super("Samsung", model, size, price, color);
    }

    public void freeze(){
        System.out.println(getBrand() +" "+getBrand()+ "is freezing");
    }
}
