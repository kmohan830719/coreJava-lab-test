/*
 * lad test on inheritance
 * @Auther: K Mohan
 * @Date: 24nov22
 */
package com.question3;

//member class
class Member{
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
	//constructor
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
			System.out.println("Manager Address: "+ Address);
			System.out.println("Manager Department is: "+ Department);
			super.printSalary();
		}
		
}
//main class
public class Inheritance2 {
	//main method
	public static void main(String[] args) {
		//object of employee
		Employee e=new Employee("Mohan",22,232344,"dt760",200000,"java");
		e.print();
		System.out.println("--------------------------");
		//object of manager
		Manager m=new Manager("Sohan",22,232344,"dt760",200000,"database");
		m.print();
	}
	
}

 
