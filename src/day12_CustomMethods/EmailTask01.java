package day12_CustomMethods;

import java.util.Scanner;

public class EmailTask01 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String email= "mike_tyson@gmail.com";
        String firstName= email.substring(0,email.indexOf("_"));
        System.out.println(firstName);

        String lastName= email.substring(email.indexOf("-")+1,email.indexOf("@"));
        String rest= email.substring(email.indexOf("@"));
        email= lastName+"_"+firstName+rest;
        System.out.println(email);


    }
}

/*
2. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */