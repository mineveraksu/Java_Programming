package day27_AccessModifiers;

public class TestCircleObjects {
    public static void main(String[] args) {
        Circle circle1=new Circle(3.5);
        Circle circle2=new Circle(5);
        Circle circle3=new Circle(7);
        System.out.println(circle1);
        System.out.println(Circle.pi);
        System.out.println(circle1.radius);
    }
}
