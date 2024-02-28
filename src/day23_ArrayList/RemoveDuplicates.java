package day23_ArrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("vasyl");
        names.add("vasyl");
        names.add("sumeye");
        names.add("sumeye");
        names.add("ali");
        names.add("sumeye");

        ArrayList<String> nonDup = new ArrayList<>();
        for (String each : names) {
            if (nonDup.contains(each)) {
                continue;
            } else {
                nonDup.add(each);
            }
        }
        names=nonDup;
        System.out.println(names);
    }
}

