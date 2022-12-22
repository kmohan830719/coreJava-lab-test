/*
Program: To check whether the number is prime or not
@Auther: K Mohan
@Date: 22Dec22
*/

//declaring package
package com.question1;

//importing the package
import java.util.*;

//declaring the ppublic class
public class PrimeNumber {
	
	// method to check prime number
	private static void checkPrime(int num) {
		
		// boolean variable
		boolean flag = false;

		// checking for prime number
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a prime number");
		} 
		else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = true;
					break;
				}
			}
		}
		//printing if the number is prime or not
		if(flag) {
			System.out.println(num + " is not a prime number");
		}else {
			System.out.println(num + " is a prime number");
		}

	}
	// end of method
	
	
	//main method
	public static void main(String[] args) {
		
		//creating the object of the scanner classs
		Scanner sc=new Scanner(System.in);
		
		//taking the user input
		System.out.println("Enter te number");
		int num=sc.nextInt();
		
		//calling the method to check whether thw num is prime or not
		checkPrime(num);
		
		//closing the scanner
		sc.close();
	}
	//ens of main method
}
//end of class
