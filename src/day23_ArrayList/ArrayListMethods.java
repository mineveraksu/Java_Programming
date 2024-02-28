package day23_ArrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        array[0]=100; //this is how we can update an array
        System.out.println(Arrays.toString(array));

        ArrayList<String> groceriesList= new ArrayList<>();
        groceriesList.add("eggs");
        groceriesList.add("paper towels");
        groceriesList.add("apples");
        groceriesList.add("cooking oil");

        System.out.println(groceriesList);
        groceriesList.set(2,"oranges"); //change the elemwnt ,dont change the size,we have to use set method to updat
        groceriesList.add(2,"chicken"); //change the element and size
        groceriesList.remove(0);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        boolean r1=numbers.remove(Integer.valueOf(10));
        System.out.println(numbers);
        numbers.remove(1);
        numbers.clear();
        System.out.println(numbers);
        numbers.remove(Integer.valueOf(20));

        ArrayList<String> names= new ArrayList<>();
        names.add("vasyl");
        names.add("vasyl");
        names.add("sumeye");
        names.add("sumeye");
        names.add("ali");
        names.add("sumeye");

        System.out.println(names.indexOf("vasyl"));
        System.out.println(names.lastIndexOf("vasyl"));
        System.out.println(names.lastIndexOf("sumeye"));

        boolean hasMuhtar=names.contains("Muhtar");  //Arraylist have contains method
        boolean hasAli=names.contains("Ali");
        System.out.println("hasAli = " + hasAli);
        System.out.println("hasMuhtar = " + hasMuhtar);

        System.out.println("--------------");
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=list1;

        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1 == list2);

        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1.equals(l2));

        ArrayList<Integer> n1=new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2=new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n2 = " + n2);
        System.out.println("n1 = " + n1);

        System.out.println(n1.equals(n2));

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());

        n1.clear();
        n2.clear();
        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());


    }
}
