package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str="Cydeo School";
        char[] ch=str.replace(" ","").toCharArray();
        System.out.println(Arrays.toString(ch));

        String str2="today is a good day to learn java";
       String[] words=str2.split(" ");

        System.out.println(Arrays.toString(words));

    String sentence="I love java";
        String[] arr=ArraysUtility.reverse(sentence.split(" "));
        System.out.println(Arrays.toString(arr));

    }
}
 /* toCharArray():  returns char array
  split(char sequence):
 */