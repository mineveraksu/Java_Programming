package day31_inheritance.shape_methodOverriding;

public class TestShapeObject {
    public static void main(String[] args) {
    Square square=new Square(5);
        System.out.println(square);
        square.draw();

        Circle circle=new Circle(3.5);
        System.out.println(circle);

        Traingle traingle=new Traingle(2.3,4.5);
        System.out.println(traingle);

        Rectangle rectangle=new Rectangle(4.5,6.5);
        System.out.println(rectangle);


    }
}
