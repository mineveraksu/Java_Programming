package day30_inheritance.typesOtherInheritance;

import java.time.LocalDate;


public class President extends Person {
    private LocalDate electedDate; // all instance variable should be private

    public President(String name, char gender, LocalDate DOB, LocalDate electedDate) {
        super(name, gender, DOB);
        setElectedDate(electedDate);
    }

    public LocalDate getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }
    public void lie(){
    }
}
