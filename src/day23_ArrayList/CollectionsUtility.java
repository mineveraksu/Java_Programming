package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        // max,min method
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
       int max= Collections.max(list);
       int min=Collections.min(list);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("-------------------");

        // sort method
        ArrayList<String> items= new ArrayList<>();
        items.addAll(Arrays.asList("eggs","Potato","milk","tomato","rice","orange","strawberry","blueberry","paper towels"));
        Collections.sort(items);
        System.out.println(items);

        //reverse method
        Collections.reverse(items);
        System.out.println(items);

        // swap
        ArrayList<String> students= new ArrayList<>(Arrays.asList("Gdir","hasan","abdullah","bilal"));
        Collections.swap(students,0,1);
        System.out.println(students);
        Collections.swap(students,0,students.size()-1);

        System.out.println("--------------------------------");




    }
}
