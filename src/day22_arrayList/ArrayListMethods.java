package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);

        System.out.println(list);
        list.add(1,15);
        System.out.println(list);
        list.add(2,25);
        System.out.println(list);

        ArrayList<String> studentList=new ArrayList<>();
        studentList.add("mohammed");
        studentList.add("abdurasul");
        studentList.add("abudullah");
        studentList.add("ttaiana");

        System.out.println(studentList.size());

        String firstStudent=studentList.get(0);
        String lastStudent=studentList.get(studentList.size()-1);

        System.out.println(firstStudent);
        System.out.println(lastStudent);
    }
}
