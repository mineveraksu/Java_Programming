package day15_whileLoop;

public class RemoveDuplicate2 {
    public static void main(String[] args) {

        String str= " xyzxyzxyz";
        String result= "";

        for (int i = 0; i < str.length(); i++) {
            if (result.contains(str.charAt(i)+"")){
                continue;
            }
            result+=str.charAt(i);

        }
        System.out.println(result);
    }
}
/*  write a program than can remove the dupl'cated characters from a string */