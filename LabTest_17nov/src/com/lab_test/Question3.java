/*
 * A program on exception handelling
 * @Auther: K MOhan
 * @Date: 17nov22
 */

//declring the package
package com.lab_test;

//importing the package
import java.util.*;

//declaring the class
public class Question3 {
	
	//creating object of the Scanner class
	Scanner sc=new Scanner(System.in);
	
	//variable
	private int choice;

	//method for displaying menu
	static void menu() {
		System.out.println("1. Start game");
		System.out.println("2. Pause game");
		System.out.println("3. Exit game");
	}
	
	//method to take user choice
	void get() {
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Starting the game");
		break;
		case 2: System.out.println("Poused game");
		break;
		case 3: System.out.println("Exit the game");
		break;
		default:System.out.println("invalid input");
		}
	}
	
	
	//main method
	public static void main(String[] args) {
		
		//creating instance of claass
		Question3 obj=new Question3();
		
		//calling the menu method
		menu();
		
		//calling the get method
		try{
			obj.get();
		}
		catch(ArithmeticException|NullPointerException|InputMismatchException e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}
}
