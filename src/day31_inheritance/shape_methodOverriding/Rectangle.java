package day31_inheritance.shape_methodOverriding;

public class Rectangle extends Shape {

    private double lenght;
    private double width;

    public Rectangle(double lenght, double width) {
        setLenght(lenght);
        setWidth(width);
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return lenght*width;
    }

    @Override
    public double perimeter() {
        return (lenght+width)*2;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", width='" + width + '\'' +
                ", length='" + lenght + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
