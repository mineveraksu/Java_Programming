package day31_inheritance.animal_methodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {
        Cat cat=new Cat("Emily","Bangle",'F',4,"Small","Gray");
        Dog dog=new Dog("Max","Husky",'M',3,"Large","White");
        Lion lion=new Lion("simba","African lion",'M',6,"Large","yellow",true);
        Eagle eagle=new Eagle("Bella","American Eagle",'F',4,"Medium","Black&White");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        cat.eat();
        dog.eat();
        eagle.eat();
        lion.eat();

    }
}
