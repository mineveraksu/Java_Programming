package day36_polymorhism;

public class Circle {
    private double radius;
    public final static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius * radius * PI;
    }

    public double perimeter(){
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "perimeter=" + perimeter() +
                "are=" + area() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Circle)){
            System.err.println("İnvalid Object");
            System.exit(1);
        }
        if (this.radius==((Circle)obj).radius){
            return true;
        }
        return false;
    }
}
