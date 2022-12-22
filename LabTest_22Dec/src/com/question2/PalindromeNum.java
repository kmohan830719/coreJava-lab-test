/*
Program: To check whether the number is palindrome or not
@Auther: K Mohan
@Date: 22Dec22
*/

//declaring package
package com.question2;

//importing the package
import java.util.*;

//declaring the class
public class PalindromeNum {
	
	//method to check palindrone number
	static void checkPalindrome(int number) {
		
		//creating the variables
		int remainder=0;
		int reverseNumber=0;
		int temp=number;
		
		//while loop to reverse the number
		while(number>0) {
			remainder=number%10;
			reverseNumber=(reverseNumber*10)+remainder;
		    number=number/10;
		}
		
		//if statement to check and print
		if(reverseNumber==temp) {
			System.out.println(temp+" is a palindrome number");
		}else {
			System.out.println(temp+" is not a palindrome number");
		}
	}
	//main method
	public static void main(String[] args) {
		 //creating an object of scanner class
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		//taking the user unput
		int originalNum=sc.nextInt();
		
		//calling the method to check palindrome
		checkPalindrome(originalNum);
		
		sc.close();
	}
  //end of main method
}
//end of class palindromeNum