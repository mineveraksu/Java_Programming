package day22_arrayList;

import utilities.ArraysUtility;

public class Test {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50,60,70,90};
        boolean has25= ArraysUtility.contains(numbers,25);
        System.out.println(has25);

        String[] students={"sumeye","hamza","marika"};
        System.out.println(ArraysUtility.contains(students, "kashyar"));
    }
}
