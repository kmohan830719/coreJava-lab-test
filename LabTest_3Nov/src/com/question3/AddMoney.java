/*
 * piggi bank to add money
 * @Auther: K MOhan
 * @Date: 03nov22
 */

//declaring the package
package com.question3;

//importing the package
import java.util.*;

//declaring the class
public class AddMoney {
	
	//main method
	public static void main(String[] args) {
		
		//creating the objects
		PiggiBank p1=new PiggiBank();
		
		//variable
		int choice=0;
		float amount=0;
		
		//creating the object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//do while loop to repeat the task
		do {	
			System.out.println("The initial amount in the PiggiBank is: "+p1.getAmount());
			
		    //taking the user choice
		    System.out.println("Do you want to add more money(1-yes/2-no)");
		    choice=sc.nextInt();
		
		    //if statement to check the choice
		    if(choice==1) {
			System.out.println("Enter the amount");
			amount=sc.nextFloat();
			System.out.println("The new amount is: "+p1.addMoney(amount)); //calling the method
		    }else {
			System.exit(0);
		    }
		    }while(choice==1);
			
	
		sc.close();
		
	}
	//end of the main method

}
//end of the class AddMoney
