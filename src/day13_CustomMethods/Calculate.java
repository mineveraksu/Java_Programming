package day13_CustomMethods;

public class Calculate {
    public static void main(String[] args) {

    }
    public static void calculate(double num1, double num2,char mathoperator){
        switch (mathoperator) {   //can not accept double,float , boolean,long
            case '+':
             System.out.println();
            case '-':
            case '*':
            case '/':
        }
    }
}
/*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

	        Ex:
	            calculate(10, 20, '+')

	        output:
	            10 + 20 = 30


	2. Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )


    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)

	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)

	        output:
	            You are eligible to vote
 */