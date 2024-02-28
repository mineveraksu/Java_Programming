package day38_Exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args) {
        //method1();
       // Library.sleep(3.5);

        //   method2();

    }

    public static void pauseFor5Seconds() throws InterruptedException{
        Thread.sleep(5000);
    }

    public static void method1() throws InterruptedException{
        System.out.println("hello world");
        pauseFor5Seconds();
        System.out.println("hello cydeo");
    }
public static void method2() throws Exception{
    System.out.println("First program started");
    Thread.sleep(3000);
    System.out.println("First program ended");
    Thread.sleep(5000);

}

}
