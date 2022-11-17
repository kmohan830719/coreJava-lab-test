/*
 * Program for hangman game?
 * @Auther: K MOhan
 * @Date: 17nov22
 */

//declring the package
package com.lab_test;

//importing the package
import java.util.*;

//declaring the class
public class Question1 {

	
	//main method
	public static void main(String[] args) {

		//creating object of the Scanner class
		Scanner sc=new Scanner(System.in);
		
		//creating a method{
	    System.out.println("Enter the words");
		String word=sc.next().toUpperCase();
		
		//length of the string
		int len=word.length();
		
		//printing the dashes
		System.out.println("The Dashes are");
		for(int i=0;i<=len;i++) {
			System.out.print("_ ");
		}
		
		//taking the user guess
		System.out.println("\nEnter your guess");
		String guess=sc.next().toUpperCase();
		
		if(guess.equals( word)) {
			System.out.println(" Correct guess");
		}else {
			System.out.println(" Sorry Wrong guess");
		}
		
		
		sc.close();
		}
		
	}

