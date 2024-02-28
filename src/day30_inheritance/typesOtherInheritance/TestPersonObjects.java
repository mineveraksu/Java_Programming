package day30_inheritance.typesOtherInheritance;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {


    Student student=new Student("Lucy",'F',LocalDate.of(1990,5,16),'A',"a01");
    President president=new President("Daniel",'M',LocalDate.of(1980,12,1),LocalDate.of(2020,1,1));
    Teacher teacher=new Teacher("Emily",'F',LocalDate.of(1985,11,1),"MathTeacher","c1",95000);

        System.out.println(student);
        System.out.println(teacher);
        System.out.println(president);

        student.study();
        president.lie();
        teacher.teach();

        student.eat("baklava");
        teacher.eat("baklava");
        president.eat("baklava");
    }
}
