package day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
        for (int i=10;i>=5;i--){
            System.out.println("Hello Cydeo"+i);
        }


        //sum of all the numbers 1-100
        //
    int sum= 0;
    for (int i=1; i<=100;i++){
        sum+=i;
    }
        System.out.println(sum);


        // print all the alphabet letters A-Z
        char ch=0;
        for (char i='A'; i<='Z';i++){
            System.out.print(i+" ");
        }
        System.out.println();

        // print the alphabetic letters in backwards
        for (char i='Z'; i>='A';i--){
            System.out.print(i+" ");
        }


    }

}
