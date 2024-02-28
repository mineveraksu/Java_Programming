package day19_array;

import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {

        int[] arr1={10,20,30,40,50};
        int[] arr2=arr1;
        int[] arr3=arr2;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        String[] a1={"umran","mehmet"};
        a1= new String[]{"JAMES","DANEİL"};

        System.out.println(a1);
    }
}
