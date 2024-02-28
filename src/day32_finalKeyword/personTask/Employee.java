package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Employee extends Person{

    public double salary;
    public String jobTitle;

    public Employee(String name, char gender, LocalDate dateOfBirth, double salary, String jobTitle) {
        super(name, gender, dateOfBirth);
        setSalary(salary);
        setJobTitle(jobTitle);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(getName() + "is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                "salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }

}
