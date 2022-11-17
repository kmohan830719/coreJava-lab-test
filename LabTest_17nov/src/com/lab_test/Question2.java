/*
 * Write 5 functions of string in java program ?
 * @Auther: K MOhan
 * @Date: 17nov22
 */

//declring the package
package com.lab_test;

//importing the package
import java.util.*;

//declaring the class
public class Question2 {

	//main method
	public static void main(String[] args) {
		
		//creating the object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking the user input
		System.out.println("Enter your name");
		String name=sc.nextLine();
		
		//String function 1
		name=name.toUpperCase();
		System.out.println("The name in the Upper case is: "+name);
		
		//String function 2
		int inxdex=name.indexOf("M");
		System.out.println("The index of letter M  is: "+inxdex);
		
		//String function 3
		name=name.replace('M','S');
		System.out.println("The name after replacing letter is: "+name);
				
		//String function 4
		int length=name.length();
		System.out.println("The length of the String is: "+length);
			
		//String function 5
		char charat=name.charAt(4);
		System.out.println("The character at the index 4 is: "+charat);
		
		sc.close();
	}
}
