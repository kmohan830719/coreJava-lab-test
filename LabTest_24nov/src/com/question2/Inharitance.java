/*
 * lad test on inheritance
 * @Auther: K Mohan
 * @Date: 24nov22
 */
package com.question2;

//parent class
 class Parent{
	 //method to print
   void print() {
	   System.out.println("This is Parent Class");
   }
} 

 //child class extending  parent 
class Child1 extends Parent{  
	 void print() {
		   System.out.println("This is Child Class 1");
	   } 
	 void parentmethod() {
		 super.print();
	 }
} 

 
public class Inharitance {
	//main method
	public static void main(String args[]){ 
		//object of parent
		Parent p= new Parent();
		p.print();
		
		//object of child
		Child1 c1=new Child1();
		c1.print();
		
		//object of child
		Child1 c2=new Child1();
		c2.parentmethod();
		
}
}