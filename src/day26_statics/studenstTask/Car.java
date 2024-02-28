package day26_statics.studenstTask;

import java.time.LocalDate;

public class Car {
    public String make;
    public String model;
    public double price;
    public String color;
    public int year;

    public Car(String make) {
        this.make = make;
        System.out.println(make);
    }

    public Car(String make, String model) {
        this(make);
        this.model = model;

    }

    public Car(String make, String model, int year) {
        this(make, model);
        this.year = year;
    }

    public Car(String make,String model,int year,double price){
        this(make,model,year);
        this.price=price;
    }

    public Car(String make, String model, double price, String color, int year) {
       this(make,model,year,price);
        this.color = color;
    }
}
