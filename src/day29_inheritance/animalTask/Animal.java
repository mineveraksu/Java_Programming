package day29_inheritance.animalTask;

public class Animal {
    private String name;
    private String breed;
    private char gender;
    private String size;
    private String color;
    private int age;

    public static boolean isAnimal;
    static {
        isAnimal=true;
    }

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setSize(size);
        setColor(color);
        setAge(age);
    }

    public void eat(){
        System.out.println(name+"is eating");
    }
    public void drink(){
        System.out.println(name+"is eating");
    }
    public void sleep(){
        System.out.println(name+"is sleeping");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static boolean isIsAnimal() {
        return isAnimal;
    }

    public static void setIsAnimal(boolean isAnimal) {
        Animal.isAnimal = isAnimal;
    }
}
