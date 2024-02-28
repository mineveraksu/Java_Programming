package day32_finalKeyword.finalKeyword;

import java.time.LocalDate;

class CydeoStudent{
    public  void language(){
        System.out.println("java programming");
    }

}

public class FinalKeyword extends CydeoStudent{

    public void language(){
        System.out.println("Python programming");
    }
    public static void main(String[] args) {
      final char gender= 'M';
        System.out.println(gender);
       // gender='F';
        System.out.println(gender);

        System.out.println("-------------------");
        LocalDate dateOfBirth=LocalDate.now();
        System.out.println(dateOfBirth);
        dateOfBirth=dateOfBirth.plusYears(1);
        System.out.println(dateOfBirth);

        new FinalKeyword().language();
        new CydeoStudent().language();
        System.out.println("----------------");

        String name="James";
        name=null;


    }


}
