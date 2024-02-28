package day19_array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AvrageNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int total = input.nextInt();
        int[] numbers = new int[total];
        int sum = 0;
        for (int i = 0; i < total; i++) {
            System.out.println("enter a number");
            numbers[i] = input.nextInt();
            sum+=numbers[i];

        }

        System.out.println("sum = " + sum);
        
        double average=sum/total;
        DecimalFormat df=new DecimalFormat("0,000");
        System.out.println(df.format(average));
    }
}
