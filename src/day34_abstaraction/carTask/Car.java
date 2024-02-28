package day34_abstaraction.carTask;

public abstract class Car {
    private final String make;
    private final String model;
    private String color;
    private final int year;
    private double price;

    public Car( String model, String color, int year, double price) {
        this.make = getClass().getSimpleName();
        this.model = model;
        this.color = color;

        if (year<1986){
            System.out.println("invalid year" + year);
            System.exit(1);
        }
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("price cannot be negative or zero");
            System.err.println(1);
        }
        this.price = price;
    }
    protected void stop(){
    }
    protected abstract void start();

    @Override
    public String toString() {
        return make+"Car{" +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
