/*
 * Write a program to create record of students using array in java
 * @Auher: K Mohan
 * @Date: 10nov22
 */

//declaring thepackage
package com.lab_test;

//importing the package
import java.util.*;

//declaring the class
public class Question1 {
	
	//main method
	public static void main(String[] args) {
		
		//creating the instance of scanner
		Scanner sc=new Scanner(System.in);
		
		int n=5;
		
		//declaring the array to store student name
		String []name=new String[n];
		
		//declaring the array to store student id
		int []id=new int[5];
		
		//taking the user input
		System.out.println("Enter the names of the students");
		for(int i=0;i<name.length;i++) {
			name[i]=sc.nextLine();
		}
		
		//taking the user input
	    System.out.println("Enter the ids of the students");
		for(int i=0;i<id.length;i++) {
			id[i]=sc.nextInt();
		}
		
		//printing the details of the students
		System.out.println("The record of the students are:");
	    for(int i=0;i<n;i++) {
	    	System.out.println("The student name is "+name[i]+" and id is "+id[i]);
	    }
				
		sc.close();
		
	}

}
