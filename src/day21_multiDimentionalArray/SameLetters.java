package day21_multiDimentionalArray;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {

        String str1 = "heart"; //"aehtr"
        String str2 = "earth"; //"aehtr"

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);
        
        boolean isAnagram=Arrays.equals(array1,array2);

        System.out.println("isAnagram = " + isAnagram);
    }
}
