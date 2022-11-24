/*
 * lad test on inheritance
 * @Auther: K Mohan
 * @Date: 24nov22
 */
package com.question1;

import java.util.Scanner;

//Student class
class Student{
	String firstName;
	String lastName;
	int age;
	String course;
	String studentId;
	
	//method to set values
	void setDetails(String Fname,String Lname,int age,String                    cou,String id){
		
	this.firstName=Fname;
	this.lastName=Lname;
	this.age=age;
	this.course=cou;
	this.studentId=id;
	}
	
	//method to print details
	void printDetails() {
		System.out.println("Student name: "+firstName+" "+lastName);
		System.out.println("Student age: "+age);
		System.out.println("Course Enrolled: "+course);
		System.out.println("Student Id: "+studentId);
	}
}

//emloyee class 
class Employee extends Student{
	double salary;
	String department;
	String designation;
	String emplyeeid;
	
	//method to set value
	void setDetails(String Fname,String Lname,int age,double sal, String dep,String des,String id){
		
	this.firstName=Fname;
	this.lastName=Lname;
	this.age=age;
	this.salary=sal;
	this.department=dep;
	this.designation=des;
	this.emplyeeid=id;
	}
	
	//method to print details
	void printDetails() {
		System.out.println("Employee name: "+firstName+" "+lastName);
		System.out.println("Employee age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+department);
		System.out.println("Designation: "+designation);
		System.out.println("Employee Id: "+emplyeeid);
	}
	
}

//main class
public class ManagementSystem {

	//main method
	public static void main(String[] args) {
		
		//creating the objects
		Student s=new Student();
		Employee m= new Employee();
		
		//creating the object of scanner class
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose to enter the details");
		System.out.println("1. Student Details");
		System.out.println("2. Employee Details");
		
		int choice=sc.nextInt();		
		switch(choice) {
		case 1:
			System.out.println("Enter the student details");
			System.out.println(" First name");
			String Fname=sc.next();
			System.out.println("Last Name");
			String Lname=sc.next();
			System.out.println("age");
			int age=sc.nextInt();
			System.out.println("course");
			String course=sc.next();
			System.out.println("Id");
			String id=sc.next();
			s.setDetails(Fname,Lname,age,course,id);
			System.out.println("The student details are");
			s.printDetails();
			break;
		case 2:
			System.out.println("Enter the Employee details");
			System.out.println(" First name");
		    String fname=sc.next();
		    System.out.println(" Last name");
		    String lname=sc.next();
		    System.out.println(" Age");
		    int Age=sc.nextInt();
		    System.out.println(" Salary");
		    double sal=sc.nextDouble();
		    System.out.println(" Department");
		    String dep=sc.next();
		    System.out.println(" Designation");
		    String des=sc.next();
		    System.out.println(" Id");
		    String Id=sc.next();
		    m.setDetails(fname,lname,Age,sal,dep,des,Id);
		    System.out.println("The Employee details are");
		    m.printDetails();
		    break;
			default:
				System.out.println("Invalid input");
			
				sc.close();
		}
	}
}
