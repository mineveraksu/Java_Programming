package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(numbers); // this method takes an collection\ we use this method to add all elements of a list to another
        System.out.println(list1);
        list1.addAll(1, numbers);
        System.out.println("-------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(75, 85, 95, 70, 80));

        System.out.println(scores);

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("hasan", "gadir"));
        System.out.println(students);

        students.addAll(2, Arrays.asList("shukur", "sumeyye", "tatiana"));
        System.out.println(students);

        Integer[] nums = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));

        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("alena", "muhtar", "gadir", "ali"));

        System.out.println(employeeList);
        boolean hasAlena = employeeList.contains("alena");
        boolean hasAlenaGagir = employeeList.containsAll(Arrays.asList("Alena", "Gadir"));
        boolean hasMuhtarAliKuzzat = employeeList.containsAll(Arrays.asList("Muhtar", "Ali", "Kuzzat"));

        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);
        System.out.println("hasAlenaGagir = " + hasAlenaGagir);
        System.out.println("hasAlena = " + hasAlena);

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 4, 0, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20, 20));
        list.removeAll(Arrays.asList(10, 20));
        System.out.println(list);

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena", "Muhtar", "Ali", "Gadir", "khashyar", "Madiyar", "Muhtar", "Muhtar"));
        developers.retainAll(Arrays.asList("Alena", "Khashyar", "Muhtar"));
        System.out.println(developers);


        ArrayList<String> grocerieslist = new ArrayList<>();
        grocerieslist.addAll(
                Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper Towels"));
        grocerieslist.retainAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato"));
        System.out.println(grocerieslist);

       //87 grocerieslist.removeAll(Arrays.asList())
    }
}
