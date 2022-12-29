/*
Program:to find out the duplicate characters in the string
@Auther: K Mohan
@Date: 29Dec22
*/

//declaring package
package com.question4;

//importing the packsge
import java.util.*;

//declaring the class
public class DuplicateCarInString {
	
	//method to find the duplicate characters
	public static void duplicate(String s) {
		//variable
		 int cnt = 0;
		 
		 //array to store string
		  char[] inp = s.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  
		  //for loop to check for duplicate elements
		  for (int i = 0; i < s.length(); i++) {
		   for (int j = i + 1; j < s.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		     cnt++;
		     break;
		    }
		  }
		} //end of for loop	
	}//end of the method

	//main method
	 public static void main(String argu[]) {

		 //creating the object of scanner class
		 Scanner sc=new Scanner(System.in);
		
		 //taking the user input
		 System.out.println("Enter the string");
		  String s =sc.next();
		  
		  //calling the method to print the duplicate elements
		  duplicate(s);
		 
		sc.close();
     }
	 //end of main method
}
//end of the class