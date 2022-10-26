/*
Program: to print the employee details
@Auther: K Mohan
@Date: 26oct22
*/

//declaring package
package com.ques2.employee;

//declaring class
public class EmpDetails {
	
	    //static variables
		static int ids=0;
		static String name=null;
		static String department=null;
		static int salary=0;

	    //creating method to get details
		public static void getDetails(int id,String n, String c,int s) {
		    ids= id;
			name=n;
			department=c;
			salary=s;
		}
		//creating method to print details
		public static void printDetails() {
				System.out.println("Employee Details are");
				System.out.println("Employee ID is: " +ids);
				System.out.println("Employee name is: " +name);
				System.out.println("Employee department is: " +department);
				System.out.println("Employee salary is: " +salary);
			}
		//end of method
		

}
//end of class
