package day35_polimorphism.transportation;

public abstract class Transportation {
    private final String make,model;
    private String color ;
    private double price;
    private final int year;

    public Transportation( String make,String model, String color, double price, int year) {
        this.make = make;
      setColor(color);
      setPrice(price);
      this.model=model;
      this.year=year;
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

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public abstract void transportPeople();
    public abstract void start();
    public void stop(){
        System.out.println("shut off the engine");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
