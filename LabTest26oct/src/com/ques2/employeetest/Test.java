/*
Program: to print the employee details
@Auther: K Mohan
@Date: 26oct22
*/

//declaring package
package com.ques2.employeetest;

//importing scanner class
import java.util.Scanner;

//importing the package
import com.ques2.employee.*;

//declaring class
public class Test {
    
	//main method
	public static void main(String[] args) {
		
		
		//creating the object of sacnner class
		Scanner sc=new Scanner(System.in);
		
		//taking the user details
		System.out.println("Employee 1");
		System.out.println("Enter your ID");
		int id=sc.nextInt();
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your department");
		String dept=sc.next();
		System.out.println("Enter your salary");
		int salary=sc.nextInt();
		
		System.out.println("------------------------");
		
		
		 
		//calling the method
		 EmpDetails.getDetails(id,name,dept,salary);
		
		//calling the method
		 EmpDetails.printDetails();
		 System.out.println("------------------------");
		 
		 //callimg method
		 employee2();
		
		
		 
	}
	//end of main
	
	//method for second employee
        public static void employee2() {
		
		//creating the object of sacnner class
		Scanner sc=new Scanner(System.in);
		
		//taking the user details
		System.out.println("Employee 2");
		System.out.println("Enter your ID");
		int id=sc.nextInt();
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your department");
		String dept=sc.next();
		System.out.println("Enter your salary");
		int salary=sc.nextInt();
		
		System.out.println("------------------------");
		//calling the method
		 EmpDetails.getDetails(id,name,dept,salary);
		
		//calling the method
		 EmpDetails.printDetails();
		
	}
        //end of method
}
//end of class
