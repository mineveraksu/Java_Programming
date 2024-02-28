package day19_array;

import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {

        int[] numbers=new int[5];
        int[] nums={10,20,30,40,50};

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers=" + Arrays.toString(numbers));
        System.out.println("nums=" + Arrays.toString(nums));

        String[] days={"monday","tuesday","wednsday","thursday","friday","saturday","sunday"};


        String[] month={"january","february","march","april","may","june","july","august","september","october","november","december"};


    }
}
