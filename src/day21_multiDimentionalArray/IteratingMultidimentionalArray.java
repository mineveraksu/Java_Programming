package day21_multiDimentionalArray;

import java.util.Arrays;

public class IteratingMultidimentionalArray {
    public static void main(String[] args) {
        int[][] arr2D={{10,20,30},{40,50,60,70,80},{90,100}};

        for (int i = 0; i <arr2D.length ; i++) {  // i :index number of 1D array in 2D array
            int[] each1D=arr2D[i];
            System.out.println(each1D);
            for (int j = 0; j <each1D.length ; j++) { // j : index number of elements in each 1D array of 2D array
                int eachElement=each1D[j];
                System.out.println(eachElement);
            }

        }

        for (int[] each1DArray : arr2D) {
            System.out.println(Arrays.toString(each1DArray));

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }

        }
    }
}
