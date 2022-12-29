/*
Program: to find the sum of the digits of an integer
@Auther: K Mohan
@Date: 29Dec22
*/

//declaring package
package com.question2;

//importing the package
import java.util.Scanner;

//declaring the class
public class SumOfDigits {

	//main method
	public static void main(String args[])  
	{ 
	
    //variables
	int number, digit, sum = 0; 
	
	//creating the object of scanner class
	Scanner sc = new Scanner(System.in);
	
	//taking the user input
	System.out.print("Enter the number: ");
	number = sc.nextInt(); 
	
	while(number > 0)  
	{  
	//finds the last digit of the given number    
	digit = number % 10;  
	//adds last digit to the variable sum  
	sum = sum + digit;  
	//removes the last digit from the number  
	number = number / 10;  
	}  
	
	//prints the result  
	System.out.println("Sum of Digits: "+sum);
	
	sc.close();
	}  
 //end of main method
}
//end of the class
