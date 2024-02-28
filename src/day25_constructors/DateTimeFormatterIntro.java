package day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("y");
        LocalDate today=LocalDate.now();
        System.out.println(today.format(df));

        DateTimeFormatter df1=DateTimeFormatter.ofPattern("MMMM-dd-y,E");
        LocalDate today1=LocalDate.now();
        System.out.println(today.format(df1));

        DateTimeFormatter tf=DateTimeFormatter.ofPattern("EEEE,MMM/dd/y hh:mm a");
        LocalTime time1=LocalTime.of(17,5);
        System.out.println(time1.format(tf));

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE,MMM/dd/y hh:mm a");
        LocalDateTime starts= LocalDateTime.now();
        System.out.println(starts.format(dtf));

        // Tuesday, 1:00 pm, Nov/24/2020

    }
}
