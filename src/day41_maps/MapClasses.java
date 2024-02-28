package day41_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>(); //random order,accept null key&null values
        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        hashMap.put("Daniel", 95000);
        hashMap.put("Arron", 78000);
        hashMap.put("Chris", null);
        hashMap.put("brenna", null);
        hashMap.put(null, 120000);
        hashMap.put(null, 110000);
        hashMap.put(null, 100000);
        System.out.println(hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); //insertion order, supports one null key,accepts null value
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Arron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("brenna", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 110000);
        linkedHashMap.put(null, 100000);
        System.out.println(linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>(); //sorted order,does not accept null key,accepts null values
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        treeMap.put("Daniel", 95000);
        treeMap.put("Arron", 78000);
        treeMap.put("Chris", null);
        treeMap.put("brenna", null);  //value can be null in treeMap
        // treeMap.put(null,120000); key can not be null in treeMap
        //treeMap.put(null,110000);
        //treeMap.put(null,100000);
        System.out.println(treeMap);


        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        hashtable.put("Daniel", 95000);
        hashtable.put("Arron", 78000);
        //   hashtable.put("Chris",null); //value can not be null
        // hashtable.put("brenna",null); key also can not be null
       // hashtable.put(null, 120000);
       // hashtable.put(null, 110000);
        //hashtable.put(null, 100000);
        try {
            hashtable.put(null,100000);
        } catch (RuntimeException e){
            e.printStackTrace();
        }


        System.out.println(hashtable);

    }

}
