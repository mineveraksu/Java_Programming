package day34_abstaraction.carTask;

import day34_abstaraction.carTask.Audi;
import day34_abstaraction.carTask.Honda;
import day34_abstaraction.carTask.Tesla;

public class TestCarObject {
    public static void main(String[] args) {
        Honda honda = new Honda("pilot", "black", 2019, 35000);
        Audi audi=new Audi("Q6","silver",2020,36000);
        Tesla tesla=new Tesla("model Y","Blue",2022,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.stop();
        audi.stop();
        tesla.stop();

        honda.start();
        audi.start();
        tesla.start();

    }
}