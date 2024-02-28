package day15_whileLoop;

import javax.swing.plaf.synth.SynthScrollBarUI;
import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("enter your age");
        int age= input.nextInt();

        while (!(age>=1 && age<=150)){
            System.out.println();
        }
    }
}
