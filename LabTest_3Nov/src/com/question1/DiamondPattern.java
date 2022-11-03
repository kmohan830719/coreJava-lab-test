/*
 * to print the daimond pattern
 * @Auther: K MOhan
 * @Date: 03nov22
 */

//declring the package
package com.question1;

//importing the package
import java.util.*;

//declaring the class
public class DiamondPattern {
	
	//main method
	public static void main(String[] args) {
		
		//creating object of the scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking the user input
		System.out.println("Enter the length of the Diamond pattern");
		int length=sc.nextInt();
		
		//outer loop 
		for(int i=1;i<=length;i++) {
			//inner loop -> to print spaces
			for(int j=i;j<=length-1;j++) {
				System.out.print(" ");
			}
			//inner loop-> to print stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//inner loop-> to print stars
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			//for next line
			System.out.println();
		}
		//end of loop
		
		//outer loop -> to reverse pattern vertically
		for(int i=length;i>=1;i--) {
			//inner loop -> to print spaces
			for(int j=i;j<=length-1;j++) {
				System.out.print(" ");
			}
			//inner loop-> to print stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//inner loop-> to print stars
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			//for next line
			System.out.println();
		}
		//end of loop
		
		sc.close();
	}
	//end of main method 

}
//end of the class DiamondPattern
