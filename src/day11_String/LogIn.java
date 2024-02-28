package day11_String;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String result= "";
        String userName1="Cydeo";
        String password1="WoodenSpoon";

        System.out.println("Please enter username");
        String userName= input.nextLine();
        System.out.println("Please enter password");
        String password=input.nextLine();
        input.close();

        if(userName.equals(userName1)&&password.equals(password1)){
            result="You are now logged in";
        }else{
            result="Incorrect username or password. Please try again";
        }
        System.out.println(result);
    }
}
/*
2. Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
 */