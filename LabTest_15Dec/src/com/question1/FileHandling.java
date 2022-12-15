/*
 * program to append data into the file
 * @Auther: K Mohan
 * @Date: 15dec22
 */

//declaring the packages
package com.question1;

//importing the packages
import java.io.*;
import java.util.*;

//declaring the class
public class FileHandling {

	//main method
	public static void main(String[] args) {
		
		//creating the object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//creating the file to store the data
		File myFile=new File("F://ProductDetails.txt");
		//try with catch
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Tking deatils from the user to inter into the file
		System.out.println("Enter id");
		String ID=sc.nextLine();
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter price");
		double price=sc.nextDouble();
		
		//Writing the details to the file
		try {
			//using filewriter to write into the file
			FileWriter filewrite=new FileWriter("F://ProductDetails.txt");
			filewrite.write("product ID: "+ID +"\n");
			filewrite.write("product Name: "+name+"\n");
			filewrite.write("product Price: "+price+"\n");
			
			filewrite.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//print the successful massage
		System.out.println("Data appended Sucsessfully");
		
		//closing the scanner object
		sc.close();
		
	}
	//end of the main method
}
//end of the class