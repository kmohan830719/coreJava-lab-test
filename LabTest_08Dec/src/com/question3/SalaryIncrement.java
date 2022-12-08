package com.question3;

//importing the package
import java.util.HashSet;

//declaring a class
class Employee{

	//variables
String name,experience;  
int salary; 

//constructor
public Employee( String name, int sal,String ex) {  
    this.name = name;  
    this.salary = sal;    
    this.experience = ex; 
}  
} 
//public class
public class SalaryIncrement  {
	 
	     //main method
	     public static void main(String[] args) {
	    	 
	     HashSet<Employee> set=new HashSet<Employee>(); 
	     
	     //Creating employee details 
	     Employee b1=new Employee("Mohan", 20000,"2year");  
	     Employee b2=new Employee("Sohan", 30000,"3year");  
	     Employee b3=new Employee("Roham", 40000,"3year");  
	     
	     //Adding details to the hashset  
	     set.add(b1);  
	     set.add(b2);  
	     set.add(b3);
	     
	     //Traversing HashSet  
	     for(Employee b:set){  
	     System.out.println(b.name+" "+b.salary+" "+b.experience);  
	     } 
	     
	     System.out.println("---------------------------------");
	     System.out.println("The employees with incremented salary");
	     
	     //another hashset for incremented salary
         HashSet<Employee> set2=new HashSet<Employee>(); 
	     
	     //Creating details   
	     Employee c1=new Employee("Sohan", 33000,"3year");  
	     Employee c2=new Employee("Roham", 44000,"3year");  
	     
	     //Adding details to the hashset  
	     set2.add(c1);  
	     set2.add(c2);  
	      
	     //Traversing HashSet  
	     for(Employee c:set2){  
	     System.out.println(c.name+" "+c.salary+" "+c.experience);  
	     } 
	     
	   }  
}
//end of class
