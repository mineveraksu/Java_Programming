package day28_encapsulation.persontask;

import day28_encapsulation.persontask.Person;

public class TestPersonObjects {
    public static void main(String[] args) {
        Person person1=new Person("muhammed");
        Person person2=new Person("hasan",30);
        Person person3=new Person("Tatia",25,'F');
        Person person4=new Person("lUCY",31,'f',"English");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        person4.name="james";
        person1.planet="mars";

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        person1.eat("baklava");
        person2.drink("water");
        person4.drink("tea");




    }
}
