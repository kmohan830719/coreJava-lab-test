//dec;aring the package
package com.question1;

//importing the package
import java.util.Scanner;

//declaring the class
public class Functionalities {
	
	//method to show menu
	public static void menu() {
		System.out.println("1.Play the game");
		System.out.println("2.view the instructions");
		System.out.println("3.View a players win percentage");
		System.out.println("4.Exit");
		System.out.println("-----------------------");
	}
	
	
	//main method
	public static void main(String[] args) {
		
		//creating the objects of classes
		Tic_Tac_Toe game=new Tic_Tac_Toe();
		Game_Instructions inst=new Game_Instructions();
		ScoreUpdate scor=new ScoreUpdate ();
		
		//creating the object of the scanner class
		Scanner sc=new Scanner(System.in);
		
		//calling the method to show the menu
		menu();
		
		//takig the user choice
		System.out.println("Enter you choice");
		int choice=sc.nextInt();

		
		//switch case
		switch(choice) {
		
		case 1: game.startGame();
		        break;
		case 2: inst.instructions();
		        break;
		case 3: scor.score();
		        break;
		case 4:
			default:
		}
		
		sc.close();
	}

}