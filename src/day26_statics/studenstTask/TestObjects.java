package day26_statics.studenstTask;

import java.lang.reflect.Array;

public class TestObjects {
    public static void main(String[] args) {
        Student student1=new Student("Yusuf", 21, 'M', "A16");
        Student student2=new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

      Student[] students={student2,student3,student4,student5};
      StudentsGroup group1=new StudentsGroup("Java Turtles",1);
        System.out.println(group1);
        group1.addStudent(student1);

    }
}
