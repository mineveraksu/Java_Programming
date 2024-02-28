package day15_whileLoop;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str="aabahhcdk";
        String result="";
        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            if (!result.contains(each+"")){
                result+=each;
            }
        }
        System.out.println(result);
    }
}
/* write a program that can remove the duplicated characters from a string*/