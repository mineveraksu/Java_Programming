package day30_inheritance.phoneTask;

import java.util.Arrays;

public class Phone {
    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("price can not zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        boolean isvalid = color.contentEquals("black") || color.contentEquals("white") || color.contentEquals("silver") || color.contentEquals("pink");
        if (isvalid) {
            this.color = color;
        } else {
            System.err.println("Invalid color: " + color);
            System.exit(1);
        }
        /*  String[] colors={"Black","White","Silver","Gold","Pink"};
        if (Arrays.asList(colors).contains(color)){
            this.color = color;
        }else {
            System.err.println("invalid color:"+color+"\n color can only be :"+Arrays.toString(colors));
        }

       */
/*  boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if(isValid) {
            this.grade = grade;
        }else{
            System.err.println("Invalid grade: "+grade);
            System.exit(1);
        }
        */
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';


    }

    public void call(long phoneNumber){
        System.out.println(getBrand() + "is calling" + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getBrand() + "is texting" + phoneNumber);
    }
    public Phone(String brand, String model, String size,double price,String color  ) {
        setBrand(brand);
        setColor(color);
        setModel(model);
        setSize(size);
        setPrice(price);
    }
}
