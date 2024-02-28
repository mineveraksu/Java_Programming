package day30_inheritance.typesOtherInheritance;

import java.time.LocalDate;


public class Teacher extends Employee{

    public Teacher(String name, char gender, LocalDate DOB, String jobTitle, String employeeID, double salary) {
        super(name, gender, DOB, jobTitle, employeeID, salary);
    }

    public void teach(){
        System.out.println(getName() + "is teaching");

    }
}
