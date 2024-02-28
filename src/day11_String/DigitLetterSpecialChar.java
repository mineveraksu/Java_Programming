package day11_String;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word");
        String word = input.next();
        input.nextLine();


        if (word.length() >= 1) {
            char f = word.charAt(0);

            if (f >= '0' && f <= '9') {
                System.out.println("first character is digit");
            } else if (f >= 'A' && f <= 'Z') {
                System.out.println("first character is uppercase letter");

            } else if (f >= 'a' && f <= 'z') {
                System.out.println("first character is lowercase letter");
            } else {
                System.out.println("first character is special character");
            }


        } else {
            System.out.println("String is empty");
        }
    }
}
/*
3. Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table

 */