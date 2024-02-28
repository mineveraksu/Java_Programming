package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String,String> map=new TreeMap<>();
        map.put("CO2","Josh");
        map.put("BO3","Nora");
        map.put("AO2","Khashyar");
        map.put("DO2","Abidullah");
        map.put("AO3","Tatiana");
        map.put("AO4","Tatiana");
        map.put("AO5","Tatiana");
        map.put("AO6","Tatiana");
        map.put("AO7","Tatiana");

        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get("AO4"));

        map.put("A04","Lucy");
        map.put("A06","Madiyar");

        System.out.println(map);
        System.out.println(map.get("BO3"));

        map.replace("CO2","Assel");
        map.replace("AO7","Marika");
        System.out.println(map);

        map.remove("A05");
        System.out.println(map);
        System.out.println(map.containsKey("BO3"));
        System.out.println(map.containsKey("H98"));

        System.out.println(map.containsValue("Lucy"));
        System.out.println(map.containsValue("Muhtar"));


    }
}
