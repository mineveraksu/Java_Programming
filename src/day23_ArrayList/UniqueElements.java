package day23_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("vasyl");
        names.add("vasyl");
        names.add("sumeye");
        names.add("sumeye");
        names.add("ali");
        names.add("sumeye");
        names.add("Shukri");
        names.add("Marika");

        for (String each : names) {
            if (names.indexOf(each)==names.lastIndexOf(each)){
                System.out.println(each);
               // break; //this is for just finding the first unic element
            }
        }
    }
}


// if(names.indexof(each)==names.lastIndexOf(each)){
//System.out.println(each);
// break;