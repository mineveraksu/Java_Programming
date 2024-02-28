package day21_multiDimentionalArray;

public class RemoveExtraSpace {
    public static void main(String[] args) {
        String str = "  Hello world      I      love      Java    ";
        String[] words = str.split(" ");
        str = "";
        for (String word : words) {
            if (word.equals(" ")) {
                continue;
            } else {
                str += word;
            }
            System.out.print(word +" ");
        }

    }
}
