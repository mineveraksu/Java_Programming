package day28_encapsulation.encapsulation;

public class Employee {

    private String name;
    private double salary;
    private String jobTitle;
    private int age;

    public Employee(String name, double salary, String jobTitle, int age) {
        setName(name);
        setSalary(salary);
        setJobTitle(jobTitle);
        setAge(age);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty()||jobTitle.isBlank()){
            System.err.println("invalid job title:"+jobTitle);
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<16){
            System.err.println("invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public String getName() {
        if (name==null){
            return "unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()||name.isBlank()){
            System.err.println("Employee name can not be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0){
            System.err.println("salary can not be negative:"+salary);
            System.exit(1);
        }
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", age=" + getAge()+
                '}';
    }
}
