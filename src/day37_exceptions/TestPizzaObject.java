package day37_exceptions;

public class TestPizzaObject {

    public static void main(String[] args) {
        Pizza pizza1=new Pizza('S',2,3);
        Pizza pizza2=new Pizza('S',2,3);

        System.out.println(pizza1 == pizza2);
        System.out.println(pizza1.equals(pizza2));


    Object obj= new Pizza('s',4,3);
    boolean r=obj.equals(pizza2);
        System.out.println(r);

        double total=((Pizza)obj).calcCost();
        System.out.println(total);


    }
}
