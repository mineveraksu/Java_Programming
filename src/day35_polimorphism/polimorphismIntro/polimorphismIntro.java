package day35_polimorphism.polimorphismIntro;

import day34_abstaraction.animalTask.*;

public class polimorphismIntro {
    public static void main(String[] args) {
        Dog dog=new Dog("max","husky",'M',4,"small","white");
        Cat cat=new Cat("max","husky",'M',4,"small","white");
        Tiger tiger=null;
        Eagle eagle=null;
        Lion lion=null;

        Animal[] animals={dog,cat,tiger,lion};



    }
}
