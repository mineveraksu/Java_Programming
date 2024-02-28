package day38_Exceptions;

public class ThrowaKeyword {
    public static void main(String[] args) {
        System.out.println("program started");
       // try {
       //     System.out.println(100 / 0);
      //  }catch ()

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("program ended");
    }
}
