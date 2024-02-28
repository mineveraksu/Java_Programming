package day30_inheritance.typesOtherInheritance;

import java.time.LocalDate;


public class Employee extends Person{
    private String jobTitle;
    private String employeeID;
    private double salary;

    public Employee(String name, char gender, LocalDate DOB, String jobTitle, String employeeID, double salary) {
        super(name, gender, DOB);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + "is working");
    }
}
