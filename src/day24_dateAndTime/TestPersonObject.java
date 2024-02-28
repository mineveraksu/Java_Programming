package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {
    public static void main(String[] args) {

    Person[] people={new Person(),new Person(),new Person(),new Person(),new Person()};
    people[0].setInfo("Daniel",'M', LocalDate.of(1989,2,25));
    people[1].setInfo("Ali",'M',LocalDate.of(1984,5,12));
    people[2].setInfo("Meryem",'F',LocalDate.of(2000,06,18));
    people[3].setInfo("Guzel",'F',LocalDate.of(1996,2,15));
    people[4].setInfo("Ahmet",'M',LocalDate.of(1975,11,5));


        ArrayList<Person> studentsList=new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));
    }
}
