package day34_abstaraction.animalTask;

public class Tiger extends Animal implements WildAnimal{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Tiger" + getName() + "is eating meat");
    }

    @Override
    public void hunt() {

    }
}
