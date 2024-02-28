package day27_AccessModifiers;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;

    public static String schholName;
    public static String scretCode;

    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    static {
        schholName="cydeo school";
        scretCode="wooden spoon";
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
