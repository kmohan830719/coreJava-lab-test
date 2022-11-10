/*
 * WAP to get student marks in array and print rank along with names
 * @Auher: K Mohan
 * @Date: 10nov22
 */

//declaring thepackage
package com.lab_test;

//importing the package
import java.util.*;

//declaring the class
public class Question3 {

	//main method
	public static void main(String[] args) {
		
		//creating the object of scanner class
		Scanner sc=new Scanner(System.in);
		    
		int n=4;
		
		//declaring an array
		String []name=new String[n];
		
		//declaring an array
		float []marks=new float[n];
		
		//declaring an array
	    int []rank=new int[n];
		
		//taking the name from the user
		System.out.println("enter the names of the students");
		for(int i=0;i<n;i++) {
			name[i]=sc.nextLine();
		}
		
		//taking the name from the user
	    System.out.println("enter the names of the students");
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
		
		//taking the name from the user
	    System.out.println("enter the rank of the students");
		for(int i=0;i<n;i++) {
			rank[i]=sc.nextInt();
		}
		
		//printing the student details
		for(int i=0;i<n;i++) {
			System.out.println(name[i]+" Marks: "+marks[i]+" Rank: "+rank[i]);
		}
		sc.close();
		
		
	}
}
