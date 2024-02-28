package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {
        int[] score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score)); //to prınt the array , it returns string object
        String result = Arrays.toString(score);
        System.out.println(result);

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};
        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};
        boolean r2 = Arrays.equals(ch1, ch2);
        System.out.println(r2);

        String[] S1 = {"A", "B", "C"};
        String[] S2 = {"A", "B", "C"};
        System.out.println(Arrays.equals(S1, S2));


        int[] nums = {100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number:" + nums[0]);
        System.out.println("Maximum number:" + nums[nums.length - 1]);

        String[] b1 = {"A", "B", "C"};
        String[] b2 = {"A", "B", "C"};


        String[] students = {"yasar", "medyar", "ali", "abdulla", "alina"};
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        int[] array={10,20,30,40,50,60,70};
        int[] array2=Arrays.copyOf(array,7);

        int[] n1={1,2,3,4,5};
        int[] n2={6,7,8,9,10,11,12};

        int[] n3=Arrays.copyOf(n1,n1.length+n2.length);
        for (int i = 0,j=n1.length; i <n2.length ; i++,j++) {
            n3[j]=n2[i];

        }
    }
}
