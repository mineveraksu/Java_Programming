package day21_multiDimentionalArray;

public class MultidimentionalArrayPractice {
    public static void main(String[] args) {
        String[] group1 = {"Lucy", "Umran", "Sumeye", "Abidullah"}; //4names;
        String[] group2 = {"Madiyar", "Khashayar", "Rayhane"}; //3 names;
        String[] group3 = {"Alena", "Evgeniya", "Shukur", "Hasan", "Bilal"}; //5 names;
        String[] group4 = {"Adelina", "Ali"}; //2 names;

        String[][] groups={group1,group2,group3,group4};
        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup=groups[i];

            for (int j = 0; j < eachGroup.length; j++) {
                String each=eachGroup[j];
                System.out.println(each);
            }
        }


    }
}
