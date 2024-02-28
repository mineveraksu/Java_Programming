package day16_nestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {
        String str = "aaabbccccddeeeeff";
        String result = ""; //"bdf"


        for (int j= 0; j <str.length(); j++) {

            int count = 0;
            char ch = str.charAt(j);
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }

            }
            if (count == 2 && !result.contains(ch + "")) {
                result += ch;
            }

        }
        System.out.println(result);
    }
}

/*
 write a program to find the frequency of all the characters
  */