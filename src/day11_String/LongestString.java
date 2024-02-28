package day11_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter one String");
        String first= input.next();
        System.out.println("Please enter another String");
        String second= input.next();
        input.close();

        if(first.length()>second.length()){
            System.out.println("First is the longest");

        }else if(second.length()>first.length()){
            System.out.println("Second is the longest");
        }else {
            System.out.println("Equal");
        }
    }

}
/*
1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string,
			        if both have the same number of characters then print "Equal"
 */