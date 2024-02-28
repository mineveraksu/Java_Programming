package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now(); //year,month of today
        System.out.println(today);
        LocalDate birthday=LocalDate.of(2000,5,25);
        System.out.println(birthday);
        System.out.println("---------");
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfWeek());
        System.out.println(birthday.getDayOfWeek());

        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfYear());
        System.out.println("--------------------------");

        LocalDate graduationDate=LocalDate.of(2025,6,4);
        graduationDate=graduationDate.plusYears(2);
        System.out.println(graduationDate);

        graduationDate=graduationDate.plusMonths(7);
        System.out.println(graduationDate);
        graduationDate=graduationDate.plusWeeks(7);
        System.out.println(graduationDate);
        graduationDate=graduationDate.plusDays(100);
        System.out.println(graduationDate);

        System.out.println("------------------------------------");
        LocalDate yourBirthDay=LocalDate.of(2005,4,1);
        LocalDate yourBrotherBirthDay=yourBirthDay.minusYears(2).minusMonths(3);
        System.out.println(yourBirthDay);
        System.out.println(yourBrotherBirthDay);

        System.out.println("--------------------------------------");
        LocalDate birthDay1=LocalDate.of(1994,7,7);
        LocalDate birthDay2=LocalDate.of(1995,6,7);
        boolean r1=birthDay1.isEqual(birthDay2);
        System.out.println(r1);


        LocalDate grad_date=LocalDate.of(2023,1,1);

        System.out.println(grad_date.isBefore(LocalDate.of(2022,12,31)));
        System.out.println(grad_date.isAfter(LocalDate.of(2022,12,31)));

        System.out.println("-----------------------------------------");



    }
}
