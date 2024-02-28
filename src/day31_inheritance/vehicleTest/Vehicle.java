package day31_inheritance.vehicleTest;

import java.time.LocalDate;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Vehicle(String brand, String model, int year, double price) {
        setBrand(brand) ;
        setModel(model);
        setPrice(price);
        setYear(year);
    }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
