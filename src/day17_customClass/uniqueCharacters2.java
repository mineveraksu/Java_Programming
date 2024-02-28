package day17_customClass;

public class uniqueCharacters2 {
    public static void main(String[] args) {
        String str="aabcccd";
        String unique="";
        for (int j = 0; j < str.length(); j++) {


        char ch=str.charAt(j);  //a
        int frequency=0;

        for (int i = 0; i < str.length(); i++) {  //checks how many time the char has appeared in str
            if (str.charAt(i)==ch){  //if the ch appeared in the string
                frequency++; //increase the frequency
            }

        }

        if (frequency==1){
            unique+=ch;
        }
    }
    }
}
