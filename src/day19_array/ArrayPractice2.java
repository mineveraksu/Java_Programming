package day19_array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {


        int[] numbers=new int[100];
        for (int i = 0,j=1; i<numbers.length; i++,j++) {
            numbers[i]=j;
        }
        System.out.println(Arrays.toString(numbers));

        int[] numbers2=new int[100];
        for (int i = 0,j=100; i <numbers2.length; i++,j--) {
            numbers2[i]=j;

        }
        System.out.println(Arrays.toString(numbers2));
    }
}
