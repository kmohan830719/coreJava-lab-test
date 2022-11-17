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
public class Question4 {
	
	//creating object of the Scanner class
	
	
	//variable
	private int a,b;
	double sum,product,diff,div;
	
	//method to do calculation	
	void get() {
    try (Scanner sc=new Scanner(System.in);){
		
		System.out.println("Enter the numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		
		//calculation
		sum=a+b;
		product=a*b;
		diff=a-b;
		div=a/b;
	}
	catch(ArithmeticException | InputMismatchException e) {
		
		System.out.println(e.getMessage());
	}
	}
	
	 void print(){
		System.out.println("The sum is: "+sum);
		System.out.println("The product is: "+product);
		System.out.println("The difference is: "+diff);
		System.out.println("The devision is: "+div);
	}
	
	//main method
	public static void main(String[] args) {
		
		//creating instance of claass
		Question4 obj=new Question4();
		
		
	    //calling the get method
	     obj.get();
		
		 obj.print();
		
	}
}
