/*
 * to print the table
 * @Author: K Mohan
 * @Date: 26oct22
 */
//declaring package
package com.ques4;

//importing scanner class
import java.util.Scanner;

//declaring class
public class Table {

	//main method
	public static void main(String[] args) {
		
		//Creating object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking user input
		System.out.println("Enter the number");
		int num=sc.nextInt();
		//variable
		int table=1;
	
		System.out.println("The table of "+num+ " is");
		//for loop
		for(int i=1; i<=10; i++) {
			table=num*i;
			System.out.println(table);
		}
		//end of loop
	}
	//end of main
}
//end of class
