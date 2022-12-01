package com.question1;

public class Game_Instructions {

	//method to show the instructions of the game
	public void instructions() {
	
		System.out.println("Instructions to play the game");
		System.out.println("1.Both the players choose either X or O to mark their cells.");
		System.out.println("2.There will be a 3×3 grid with numbers assigned to each of the 9 cells.");
		System.out.println("3.The player who chose X begins to play first.");
		System.out.println("4.He enters the cell number where he wishes to place X.");
		System.out.println("5.Now, both O and X play alternatively until any one of the two wins.");
		System.out.println("6.Winning criteria: Whenever any of the two players has fully filled one row/ column/ diagonal with his symbol (X/ O), he wins and the game ends.");
		System.out.println("7.If neither of the two players wins, the game is said to have ended in a draw.");
	}
}
