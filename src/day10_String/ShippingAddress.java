package day10_String;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your full name");
        String full_name=input.nextLine();


        System.out.println("Enter your building number");
        String building_number=input.next();

        input.nextLine();


        System.out.println("Enter your Street name");
        String street_name=input.nextLine();

        System.out.println("Enter your city name:");
        String city_name=input.nextLine();

        System.out.println("Enter your state name");
        String state_name=input.nextLine();

        System.out.println("Enter your zipcode");
        String zip_cede=input.next();


        System.out.println("your shipping address is:");
        //System.out.println(\t);
    }
}
