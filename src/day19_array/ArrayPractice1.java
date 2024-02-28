package day19_array;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {

    String[] myGroup=new String[5];
    myGroup[0]="gulçin";
    myGroup[myGroup.length-1]="aslı";
        System.out.println(Arrays.toString(myGroup));
        myGroup[2]="sumeyye";
        myGroup[1]="abdullah";
        myGroup[3]="khashyar";

        for (int i = myGroup.length - 1; i >= 0; i--) {
            System.out.println(myGroup[i]);
        }

    }
}
