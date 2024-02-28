package day26_statics.studenstTask;

public class TestCarObject {
    public static void main(String[] args) {
        Car car1=new Car("BMW");
        System.out.println(car1);

        Car car2= new Car("Audi","Q4");
        System.out.println(car2);

        Car car3=new Car("Honda","Accord",2021);
    }
}
