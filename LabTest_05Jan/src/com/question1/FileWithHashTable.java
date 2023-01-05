package com.question1;

import java.io.*;
import java.util.Hashtable;
import java.util.Scanner;

public class FileWithHashTable {

	
	//main method
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//creating the object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//creating a text file
		File f=new File("Contact.txt");
		boolean result=f.createNewFile();
		//checking if the file is created
		if(result) {
			System.out.println("File is ceated");
		}else {
			System.out.println("try again");
		}
		
		//cfeating a hash table to insert data intpo the file
		Hashtable<String, Integer> table=new Hashtable<>();
		table.put("K Mohan", 911012356);
		table.put("Mohan", 891012356);
		table.put("Rohan", 781012356);
		table.put("Shubham", 971012356);
		table.put("Raju", 541012356);
		
		//writing the data into the file
		FileOutputStream fl = new FileOutputStream("Contact.txt");  
	    ObjectOutputStream out = new ObjectOutputStream(fl);   
		System.out.println("Writing Hashtable Object...");
		out.writeObject(table);
		out.close();
		
		//reading the data
		System.out.println("Enter the name like(K Mohan,Mohan,Rohan,Shubham,Raju)");
		String name=sc.nextLine();
		
		//using the switch case to print the correeponding number
		switch(name) {
		case "K Mohan":System.out.println(table.get("K Mohan"));
		break;
		case "Mohan":System.out.println(table.get("Mohan"));
		break;
		case "Rohan":System.out.println(table.get("K Mohan"));
		break;
		case "Shubham":System.out.println(table.get("Mohan"));
		break;
		case "Raju":System.out.println(table.get("Mohan"));
		break;

		default:System.out.println("wrong input");
		}
		
		sc.close();
		
	}
}
