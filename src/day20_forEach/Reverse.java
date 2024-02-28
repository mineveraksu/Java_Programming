package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] numbers={100,50,20,30,70};
        int[] reverse=new int[numbers.length];

        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j]=numbers[i];

        }
        System.out.println(Arrays.toString(reverse));

        int[] numbers2={100,50,20,30,70};
        int[] reverse2= ArraysUtility.reverse(numbers2);

        System.out.println(Arrays.toString(reverse2));


    }
}

/*
3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};
 */