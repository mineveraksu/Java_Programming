package day32_finalKeyword.carTask_methodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public final class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void autoPilot(){
        System.out.println(getMake() + " " + getModel() + "is in self-driving model");
    }

    @Override
    public void start() {
        System.out.println("say \"start\" to start" + getMake() + " " + getModel());
    }


    @Override
    public void setModel(String model) {
        String[] models={"s","y","x","3"};
        if (!Arrays.asList(models).contains(model)){
            System.err.println("invalid model:"+model);
        }
        super.setModel(model);
    }

    public void setColor(String color){
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("whitw","red","black","Silver", "Blue", "Brown", "Green"));
        if (colors.contains(color)){
            System.err.println("invalid color");
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setYear(int year) {
        if (year<2008){
            System.err.println("invalid year:"+year);
        }
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {
        if (price<50000){
            System.err.println("invalid price for tesla:"+price);
        }
        super.setPrice(price);
    }
}
/*
 5. Tesla
               		start(): "Say \"Start\""

	                Extra method:
	                	  autoPilot()

	                Extra Conditions for the variables:
	                    1. Model of tesla can only be set to one of the followings:
	                        {"Model S", "Model Y", "Model x", "Model 3" };
	                    2. color of tesla can only be set to one of the followings:
	                        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
	                    3. year of the tesla can not be less than 2008
	                    4. price of tesla can not be less than 50k
 */
