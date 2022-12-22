/*
Program: to test the member class
@Auther: K Mohan
@Date: 22Dec22
*/

//declaring package
package com.question3;

//declaring the class
public class Test {

	//main method
	public static void main(String[] args) {
		
		//object of employee
		Employee e=new Employee("Mohan",22,98768765,"dt764 jodhpur",400000,"java");
		e.print();
		System.out.println("--------------------------");
		
		//object of manager
		Manager m=new Manager("Sohan",21,91101234,"dt760 damside",300000,"database");
		m.print();
	}
	//end of main method
}
//end of the class
