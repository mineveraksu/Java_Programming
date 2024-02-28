package day29_inheritance.animalTask;

public class Cat extends Animal{
    public void meow(){
        System.out.println(getName() + "is moving");
    }
    public void scratch(){
        System.out.println(getName() + "is scratching");
    }
}
