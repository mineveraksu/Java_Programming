package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {
        Person person=new Person("Daniel",'M', LocalDate.of(1991,1,1));
        System.out.println(person);

        System.out.println("---------");
        Employee employee=new Employee("Emily",'F',LocalDate.of(1989,1,2),11000,"DEVELOPER");
        System.out.println(employee);


    }
}
