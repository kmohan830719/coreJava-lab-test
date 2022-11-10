/*
 * WAP to get car model and name,then print as constant
 * @Auher: K Mohan
 * @Date: 10nov22
 */

//declaring thepackage
package com.lab_test;


//declaring the class
public class Question5 {

	//taking car model inside enum
	enum carModel{ Audi(200),Tata(43),Mahindra(12);
	int i;
	carModel(int i){
		this.i=i;
	}};

	//main method
	public static void main(String[] args) {
		// printing the values
		for(carModel m:carModel.values()) {
			System.out.println(m+":"+m.i);
		}
	}
		
	
}
