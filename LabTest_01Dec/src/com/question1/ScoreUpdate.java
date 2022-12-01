package com.question1;

import java.io.*;
import java.util.*;

public class ScoreUpdate {
	
	//method to write and update a tnxt file
	public void score() {
		
		try {
			FileWriter fwrite=new FileWriter("Score.txt");
			fwrite.write("the score is 5");
			fwrite.close();
		}catch(IOException e){
			System.out.println("unable to create this file");
			e.printStackTrace();
		}
		System.out.println("the score is 5");
	
	}
	//method to read from the file
	public void read() throws FileNotFoundException {
		File myf=new File("Score.txt");
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()) {
			String line= sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		
	}
	

}
