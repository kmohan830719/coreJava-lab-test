/*
Program: assignment on inheritance
@Auther: K Mohan
@Date: 22Dec22
*/

//declaring package
package com.question3;

//member class
class Member{
	//data members
	String Name;
	int Age;
	int Phoneno;
	String Address;
	double Salary;

	//method to print salary
	void printSalary() {
		System.out.println("Salary is "+Salary);
	
	}
}

//employye extending member
class Employee extends Member{
	String Specilization;
	
	//constructor to assign thevalues
	Employee(String n,int a,int ph,String add,double sal,String sp){
		this.Name=n;
		this.Age=a;
		this.Phoneno=ph;
		this.Address=add;
		this.Salary=sal;
		this.Specilization=sp;
	}
	
	//method to print details
	void print(){
		System.out.println("Employee Name: "+ Name);
		System.out.println("Employee Age: "+ Age);
		System.out.println("Employee Phone no: "+ Phoneno);
		System.out.println("Employee Address: "+ Address);
		System.out.println("Employee Specilization is: "+ Specilization);
		super.printSalary();
	}
}
//manager class  extends member
class Manager extends Member{
	String Department;
	 //constructor
		Manager(String n,int a,int ph,String add,double sal,String dp){
			this.Name=n;
			this.Age=a;
			this.Phoneno=ph;
			this.Address=add;
			this.Salary=sal;
			this.Department=dp;
		}
		//method to print
		void print(){
			System.out.println("Manager Name: "+ Name);
			System.out.println("Manager Age: "+ Age);
			System.out.println("Manager Phone no: "+ Phoneno);
			System.out.println("Manager Address: "+ Address);
			System.out.println("Manager Department is: "+ Department);
			super.printSalary();
		}
		
}
//end of class