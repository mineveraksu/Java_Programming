package day31_inheritance.shape_methodOverriding;

public class Traingle extends Shape {
    private double lenght;
    private double breadth;

    public Traingle(double lenght, double breadth) {
        getBreadth();
        getLenght();
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return lenght*breadth;
    }

    @Override
    public double perimeter() {
        return 2*(lenght+breadth);
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", bredth='" + breadth + '\'' +
                ", length='" + lenght + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


}
