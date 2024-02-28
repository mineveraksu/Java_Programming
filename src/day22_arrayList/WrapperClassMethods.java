package day22_arrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

    String str="20";
        System.out.println((str + 1));
        int num1=Integer.parseInt(str);
        //Integer num1=Integer.parseInt(str); //unboxing
        System.out.println(num1);
        System.out.println((num1 + 1));

        Integer num2=Integer.valueOf(str);
        System.out.println(num2);

        String s="20,5";
        double num3=Double.parseDouble(s);
       Double num4 =Double.valueOf(s);

       String x="true";
       boolean r1=Boolean.parseBoolean(x);
       Boolean r2=Boolean.valueOf(x);

       // isDigit method of Character wrapper class, for digit 0-9
        // isLoweCaseLetter
        // isUpperCase
        //isSpecialLetter

       char ch='1';
       char ch2='A';
       boolean isDigit=Character.isDigit(ch);
       boolean isLetter=Character.isLetter(ch2);
       boolean isLowerCaseLetter=Character.isLowerCase(ch2);
       boolean isUpperCaseLetter=Character.isUpperCase(ch2);
       boolean isSpecialCharacter=!Character.isLetterOrDigit(ch2);
        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        // isLetter method of Character wrapper class for a-z uppercase or downcase



       String string="a1b2c3d4e5";
       int sum=0;
        for (char each : string.toCharArray()) {  // string.toCharArray()->create char array out of strıng, then for each loop to get each character
            if (Character.isDigit(each)){  //now we cna use the isDigitmethod of Chracter wrapperclass
                sum+=Integer.parseInt(""+each);  //because each is char,so wo concate with "" to turn it into strıng
                //and then to calculate the sum , we use integer.parseInt method to turn string into int ,then we assign it to th sum
             }

        }

    }

}
// wrapper class methods
//parse: convert strıng to prımıtıve
// valueof: convert string into wrapperclas
