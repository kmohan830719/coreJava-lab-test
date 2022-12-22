/*
Program: to print area and perimeter using inheritance
@Auther: K Mohan
@Date: 22Dec22
*/

//declaring package
package com.question4;

//declaring the class
class Rectangle{
	
	//data members
	double length;
	double breadth;
	double side;
	
	//method to print area of rectangle
	public void printArea() {
		System.out.println("The area of rectangle is: "+length*breadth);
	}
	
	//method to print perimeter of rectangle
	public void printPerimeter() {
		System.out.println("The perimeter of rectangle is: "+2*(length+breadth));
	}
	
	//constructor to assign values
	Rectangle(double len,double bre){
		this.length=len;
		this.breadth=bre;
	}
	//default constructor
	public Rectangle() {
		super();
	}
	
	//method to print area and perimeter of square
	public void squareAreaPeri() {
		System.out.println("The area of square is: "+side*side);
		System.out.println("The perimeter of square is: "+side*4);
	}
	
}
//end of method

//class square extends rectangle
class Square extends Rectangle{
	//method to call parent class
	public void area() {
	super.squareAreaPeri();
	}
	//constructor
	Square(double side){
		this.side=side;
	}
}
//end of class

//declaring the public class
public class AreaPerimeter {

	//main method
	public static void main(String[] args) {
		
		//creating the object of rectangle class
		Rectangle re= new Rectangle(12,13);
		re.printArea();
		re.printPerimeter();
		System.out.println();
		
		//creating the object of Square class
		Square s=new Square(12);
		s.area();
			
	}
	//end of main method
}
//end of public class
