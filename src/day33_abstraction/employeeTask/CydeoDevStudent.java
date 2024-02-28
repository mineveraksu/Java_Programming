package day33_abstraction.employeeTask;

import day32_finalKeyword.personTask.Person;

import java.time.LocalDate;

public class CydeoDevStudent extends Person {
    private final String id;
    private String batchName;
    private int batchNumber;
    private final static String programmingLanguage;

    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        if (getAge()<18){
            System.err.println("Cydeo developer student must be at least 18 years old");
            System.exit(1);}
        this.id = id;
        setBatchNumber(batchNumber);
        setBatchName(batchName);
    }
    static {
       programmingLanguage="java";
    }


    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

}
