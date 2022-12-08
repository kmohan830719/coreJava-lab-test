package com.question1;

//importing the package
import java.util.HashSet;

//declaring the class
 class Contact {
	
//variables	 
 String name,email;  
 int number; 
 
 //constructor
 public Contact( String name, String email,int num) {  
     this.name = name;  
     this.email = email;    
     this.number = num; 
 }  
} 
 //public class
 public class ContactBook {
	 
	 //main method
	     public static void main(String[] args) {
	    	 
	     HashSet<Contact> set=new HashSet<Contact>();
	     
	     //printing the contact details
	     System.out.println("The contact details are");
	     System.out.println("---------------");
	     
	     //Creating contacts 
	     Contact b1=new Contact("Mohan", "km232@gmail.com",96543623);  
	     Contact b2=new Contact("Sohan", "Soh323@gmail.com",96523623);  
	     Contact b3=new Contact("Roham", "roh122132@gmail.com",96543623);  
	     
	     //Adding contacts to the hashset  
	     set.add(b1);  
	     set.add(b2);  
	     set.add(b3);  
	     //Traversing HashSet  
	     for(Contact b:set){  
	     System.out.println(b.name+" "+b.email+" "+b.number);  
	     }   }  
	} 
 //end of the class


