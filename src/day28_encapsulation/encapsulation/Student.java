package day28_encapsulation.encapsulation;

public class Student {
    private int age;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age<1){ //if age is invalid
            System.err.println("invalid age:"+age);
            System.exit(1); //existing the method
        }
        this.age=age;

    }
}
