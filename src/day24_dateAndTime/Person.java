package day24_dateAndTime;

import java.time.LocalDate;

//we create costum class so that we can create object and store dıfferent datas in ıt
public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;


    public void setInfo(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear()-dateOfBirth.getYear();
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}


